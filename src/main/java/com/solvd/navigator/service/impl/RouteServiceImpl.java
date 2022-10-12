package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.RouteDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Segment;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.service.ICalculate;
import com.solvd.navigator.service.IRouteService;

import java.util.List;

public class RouteServiceImpl implements IRouteService, ICalculate {

    private final RouteDaoImpl routeDao;
    private final TripServiceImpl tripService;
    private final SegmentServiceImpl segmentService;
    private final PointServiceImpl pointService;

    public RouteServiceImpl() {
        routeDao = new RouteDaoImpl();
        tripService = new TripServiceImpl();
        segmentService = new SegmentServiceImpl();
        pointService = new PointServiceImpl();
    }

    @Override
    public void create(Route route) {
    }

    @Override
    public Route getById(Long id) {
        return null;
    }

    @Override
    public void update(Route route) {

    }

    @Override
    public void delete(Route route) {

    }

    @Override
    public List<Route> getAll() {
        return null;
    }

    @Override
    public void findShortestRoute() {
        Trip trip = tripService.getTripParameters();
        List<Segment> allSegments = segmentService.getAll();
        List<Point> allPoints = pointService.getAll();
        Point processedPoint;
        Point currentPoint = null;
        Point endPoint = null;

        for (Point point : allPoints) {
            if (point.getCity().equals(trip.getStartPoint().getCity())) {
                point.setBegin(true);
                point.setValue(1);
            }
            if (point.getCity().equals(trip.getFinishPoint().getCity())) {
                endPoint = point;
            }
        }
        while (endPoint.getValue() == 0) {
            int pointValue = 100000;
            for (Point point : allPoints) {
                if (point.getValue() == 0) {
                    for (Segment segment : allSegments) {
                        List<Point> segmentPoints = segment.getPoints();
                        for (Point point1 : segmentPoints) {
                            if (point1.getCity().equals(point.getCity())) {
                                if (point1.equals(segmentPoints.get(0))) {
                                    processedPoint = segmentPoints.get(1);
                                } else {
                                    processedPoint = segmentPoints.get(0);
                                }
                                processedPoint.setValue(0);
                                for (Point value : allPoints) {
                                    if (value.getCity().equals(processedPoint.getCity()) & value.getValue() > 0) {
                                        int l = value.getValue() + segment.getLength();
                                        if (l < pointValue) {
                                            pointValue = l;
                                            currentPoint = point;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (Point point : allPoints) {
                if (point.getCity().equals(currentPoint.getCity())) {
                    point.setValue(pointValue);
                }
            }
        }
        int routeLength = endPoint.getValue() - 1;
        System.out.println();
        System.out.println("Route length is - " + routeLength);
        System.out.println("Travel type: " + trip.getTravelType());
        calculateTravelTime(routeLength, trip);

    }

    @Override
    public Route findAlternativeRoute(Trip trip) {
        return null;
    }

    @Override
    public void calculateTravelTime(Integer routeLength, Trip trip) {
        Integer speed = null;
        switch (trip.getTravelType()) {
            case BUS:
                speed = 70;
                break;
            case CAR:
                speed = 90;
                break;
            case ON_FOOT:
                speed = 5;
                break;
            default:
                break;
        }
        System.out.println("Approximate travel time: " + routeLength*60/speed + " minutes.");
    }
}
