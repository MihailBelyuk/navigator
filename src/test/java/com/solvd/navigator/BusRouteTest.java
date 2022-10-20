package com.solvd.navigator;

import com.solvd.navigator.domain.BusRoute;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.service.IBusRouteService;
import com.solvd.navigator.service.IPointService;
import com.solvd.navigator.service.impl.BusRouteServiceImpl;
import com.solvd.navigator.service.impl.PointServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class BusRouteTest {

    private IBusRouteService busRouteService;

    @BeforeClass
    public void initialize() {
        busRouteService = new BusRouteServiceImpl();
    }

    @Test(testName = "Should find straight bus routes according to trip",
            dataProvider = "provideStartDestinationPointsId",
            dataProviderClass = DataProviderClass.class)
    public void shouldFindStraightBusRouteMatchingTrip(Long startPointId, Long finishPointId) {
        IPointService pointService = new PointServiceImpl();
        Point start = pointService.getById(startPointId);
        Point finish = pointService.getById(finishPointId);
        Trip trip = new Trip();
        trip.setStartPoint(start);
        trip.setFinishPoint(finish);
        BusRoute straightBusRoute = null;
        List<BusRoute> busRoutes = busRouteService.getAllBusRoutes();
        for (BusRoute route : busRoutes) {
            List<Point> routePoints = route.getRoutePoints();
            boolean matchStartPoint = routePoints.stream().anyMatch(p -> p.getCity().equals(trip.getStartPoint().getCity()));
            if (matchStartPoint) {
                boolean matchDestPoint = routePoints.stream()
                        .anyMatch(point1 -> point1.getCity().equals(trip.getDestinationPoint().getCity()));
                if (matchDestPoint) {
                    straightBusRoute = route;
                    break;
                }
            }
        }
        Assert.assertNotNull(straightBusRoute, "Straight bus route matching trip exists");
    }
}
