package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.BusRouteDaoImpl;
import com.solvd.navigator.domain.BusRoute;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.exception.ResourceNotFoundException;
import com.solvd.navigator.service.IBusRouteService;

import java.util.ArrayList;
import java.util.List;

public class BusRouteServiceImpl implements IBusRouteService {

    private final BusRouteDaoImpl busRouteDao;

    public BusRouteServiceImpl() {
        busRouteDao = new BusRouteDaoImpl();
    }

    @Override
    public void createBusRoute(BusRoute busRoute) {
        busRouteDao.insert(busRoute);
    }

    @Override
    public BusRoute getBusRouteById(Long id) {
        return busRouteDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to retrieve bus route with id " + id));
    }

    @Override
    public void updateBusRoute(BusRoute busRoute) {
        busRouteDao.update(busRoute);
    }

    @Override
    public void deleteBusRoute(BusRoute busRoute) {
        busRouteDao.delete(busRoute);
    }

    @Override
    public List<BusRoute> getAllBusRoutes() {
        return busRouteDao.findAll();
    }

    @Override
    public List<BusRoute> findBusRoute(Trip trip) {
        List<BusRoute> actualBusRoutes = null;
        List<BusRoute> busRoutes = getAllBusRoutes();
        BusRoute busRoute = null;
        Point startPoint = null;
        for (BusRoute route : busRoutes) {
            List<Point> routePoints = route.getRoutePoints();
            for (Point point : routePoints) {
                if (point.getCity().equals(trip.getStartPoint().getCity())) {
                    startPoint = point;
                    for (Point point1 : routePoints) {
                        if (point1.getCity().equals(trip.getDestinationPoint().getCity())) {
                            busRoute = route;
                            actualBusRoutes = new ArrayList<>();
                            actualBusRoutes.add(busRoute);
                            System.out.println("You need bus with route: " + route.getName());
                            break;
                        }
                    }
                }
            }
        }
        if (startPoint == null) {
            System.out.println("Sorry, can't build bus route, because no buses pass through provided start point.");
            System.out.println("Please try other trip parameters.\n");
        } else if (busRoute == null) {
            actualBusRoutes = findInterceptingRoutes(trip);
        }
        return actualBusRoutes;
    }

    public List<BusRoute> findInterceptingRoutes(Trip trip) {
        Point start = trip.getStartPoint();
        Point destination = trip.getDestinationPoint();
        List<BusRoute> relativeRoutes = new ArrayList<>();
        List<BusRoute> routesWithSameStart = new ArrayList<>();
        List<BusRoute> routesWithSameDest = new ArrayList<>();
        BusRoute firstBusRoute = null;
        BusRoute secondBusRoute = null;
        Point interceptionPoint = null;
        findRoutesWithSamePoint(start, destination, routesWithSameStart, routesWithSameDest);
        for (BusRoute routeWithSameStart : routesWithSameStart) {
            for (Point point : routeWithSameStart.getRoutePoints()) {
                for (BusRoute routeWithSameDest : routesWithSameDest) {
                    for (Point point1 : routeWithSameDest.getRoutePoints()) {
                        if (point.getCity().equals(point1.getCity())) {
                            collectRelativeRoutes(relativeRoutes, routeWithSameStart, routeWithSameDest);
                            secondBusRoute = routeWithSameDest;
                            firstBusRoute = routeWithSameStart;
                            interceptionPoint = point1;
                            break;
                        }
                    }
                }
            }
        }
        if (secondBusRoute == null) {
            System.out.println("Sorry, can't build bus route, because there are no buses passing through provided destination point.");
            System.out.println("Please try other trip parameters.\n");
        } else {
            System.out.println("Take bus route " + firstBusRoute.getName() + " from " + start.getCity() + " to " + interceptionPoint.getCity() +
                    ", than get on the bus " + secondBusRoute.getName() + " to " + destination.getCity());
        }
        return collectInterceptingRoutes(firstBusRoute, secondBusRoute);
    }

    private List<BusRoute> collectInterceptingRoutes(BusRoute firstBusRoute, BusRoute secondBusRoute) {
        List<BusRoute> interceptingRoutes = null;
        if (firstBusRoute != null & secondBusRoute != null) {
            interceptingRoutes = new ArrayList<>();
            interceptingRoutes.add(firstBusRoute);
            interceptingRoutes.add(secondBusRoute);
        }
        return interceptingRoutes;
    }

    private void collectRelativeRoutes(List<BusRoute> relativeRoutes, BusRoute routeWithSameStart, BusRoute routeWithSameDest) {
        relativeRoutes.add(routeWithSameStart);
        relativeRoutes.add(routeWithSameDest);
    }

    private void findRoutesWithSamePoint(Point startPoint, Point finishPoint, List<BusRoute> routesWithSameStart, List<BusRoute> routesWithSameEnd) {
        List<BusRoute> allBusRoutes = getAllBusRoutes();
        for (BusRoute route : allBusRoutes) {
            List<Point> routePoints = route.getRoutePoints();
            for (Point point : routePoints) {
                collectRoutesWithSameStartOrEndPoints(startPoint, finishPoint, routesWithSameStart, routesWithSameEnd, route, point);
            }
        }
    }

    private void collectRoutesWithSameStartOrEndPoints(Point startPoint, Point finishPoint, List<BusRoute> routesWithSameStart, List<BusRoute> routesWithSameEnd, BusRoute route, Point point) {
        if (point.getCity().equals(startPoint.getCity())) {
            routesWithSameStart.add(route);
        } else if (point.getCity().equals(finishPoint.getCity())) {
            routesWithSameEnd.add(route);
        }
    }
}
