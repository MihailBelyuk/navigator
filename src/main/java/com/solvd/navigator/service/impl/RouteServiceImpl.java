package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.IRouteDao;
import com.solvd.navigator.dao.impl.RouteDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Segment;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.domain.exception.ResourceNotFoundException;
import com.solvd.navigator.service.ICalculate;
import com.solvd.navigator.service.IPointService;
import com.solvd.navigator.service.IRouteService;
import com.solvd.navigator.service.ISegmentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteServiceImpl implements IRouteService, ICalculate {

    private final IRouteDao routeDao;
    private final ISegmentService segmentService;
    private final IPointService pointService;

    public RouteServiceImpl() {
        routeDao = new RouteDaoImpl();
        segmentService = new SegmentServiceImpl();
        pointService = new PointServiceImpl();
    }

    @Override
    public void create(Route route) {
        routeDao.insert(route);
    }

    @Override
    public Route getById(Long id) {
        return routeDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to retrieve route with id " + id));
    }

    @Override
    public void update(Route route) {
        routeDao.update(route);
    }

    @Override
    public void delete(Route route) {
        routeDao.delete(route);
    }

    @Override
    public List<Route> getAll() {
        return routeDao.findAll();
    }

    @Override
    public void createRoutePoints(Route route, List<Point> routePoints) {
        routePoints.forEach(point -> routeDao.insertRoutePoints(route, point));
    }

    @Override
    public Route findRoute(Trip trip) {
        Route route = new Route();
        List<Segment> allSegments = segmentService.getAll();
        List<Point> allPoints = pointService.getAll();
        List<Point> routePoints = new ArrayList<>();
        Point processedPoint;
        Point currentPoint = null;
        Point destinationPoint = null;
        Point startPoint = null;
        String prevCity = null;
        for (Point point : allPoints) {
            startPoint = checkStartPoint(trip, startPoint, point);
            destinationPoint = checkDestinationPoint(trip, destinationPoint, point);
        }
        if (startPoint != null && destinationPoint != null) {
            if (startPoint.getCity().equals(destinationPoint.getCity())) {
                buildRouteWithSameStartAndDestination(trip, route, routePoints, destinationPoint, startPoint);
                return route;
            }
            while (destinationPoint.getValue() == 0) {
                int pointValue = 100000;
                for (Point point : allPoints) {
                    if (point.getValue() == 0) {
                        for (Segment segment : allSegments) {
                            List<Point> segmentPoints = segment.getPoints();
                            for (Point point1 : segmentPoints) {
                                if (point1.getCity().equals(point.getCity())) {
                                    processedPoint = processPoint(segmentPoints, point1);
                                    processedPoint.setValue(0);
                                    for (Point value : allPoints) {
                                        if (value.getCity().equals(processedPoint.getCity()) & value.getValue() > 0) {
                                            int l = value.getValue() + segment.getLength();
                                            if (l < pointValue) {
                                                pointValue = l;
                                                currentPoint = point;
                                                prevCity = value.getCity();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                setPointParameters(allPoints, currentPoint, prevCity, pointValue);
            }
        }
        assert destinationPoint != null;
        adjustPreviousPoint(trip, allPoints, routePoints, destinationPoint);
        routePoints.add(startPoint);
        Collections.reverse(routePoints);
        int routeLength = destinationPoint.getValue() - 1;
        getTripInformation(trip, routePoints, routeLength);
        buildRoute(route, routePoints, routeLength);
        create(route);
        createRoutePoints(route, routePoints);
        return route;
    }

    private Point checkDestinationPoint(Trip trip, Point destinationPoint, Point point) {
        if (point.getCity().equals(trip.getDestinationPoint().getCity())) {
            destinationPoint = point;
        }
        return destinationPoint;
    }

    private Point checkStartPoint(Trip trip, Point startPoint, Point point) {
        if (point.getCity().equals(trip.getStartPoint().getCity())) {
            startPoint = buildPoint(point);
        }
        return startPoint;
    }

    private void buildRouteWithSameStartAndDestination(Trip trip, Route route, List<Point> routePoints, Point destinationPoint, Point startPoint) {
        System.out.println("Start point - " + trip.getStartPoint().getCity());
        System.out.println("Destination point - " + trip.getDestinationPoint().getCity());
        System.out.println("Route length is - " + 0 + " km");
        route.setDistance(0);
        routePoints.add(destinationPoint);
        routePoints.add(startPoint);
        route.setRoutePoints(routePoints);
        create(route);
    }

    private void adjustPreviousPoint(Trip trip, List<Point> allPoints, List<Point> routePoints, Point destinationPoint) {
        String city;
        city = destinationPoint.getCity();
        int s = 0;
        while (s == 0) {
            for (Point point : allPoints) {
                if (point.getCity().equals(city) & s == 0) {
                    city = point.getPreviousCity();
                    routePoints.add(point);
                    if (point.isPrevious() & point.getPreviousCity().equals(trip.getStartPoint().getCity())) {
                        s = 1;
                    }
                }
            }
        }
    }

    private Point processPoint(List<Point> segmentPoints, Point point1) {
        Point processedPoint;
        if (point1.equals(segmentPoints.get(0))) {
            processedPoint = segmentPoints.get(1);
        } else {
            processedPoint = segmentPoints.get(0);
        }
        return processedPoint;
    }

    private Point buildPoint(Point point) {
        Point startPoint;
        point.setBegin(true);
        point.setValue(1);
        startPoint = point;
        return startPoint;
    }

    private void buildRoute(Route route, List<Point> routePoints, int routeLength) {
        route.setRoutePoints(routePoints);
        route.setDistance(routeLength);
    }

    private void setPointParameters(List<Point> allPoints, Point currentPoint, String prevCity, int pointValue) {
        for (Point point : allPoints) {
            if (point.getCity().equals(currentPoint.getCity())) {
                point.setValue(pointValue);
                point.setPreviousCity(prevCity);
                point.setPrevious(true);
            }
        }
    }

    private void getTripInformation(Trip trip, List<Point> routePoints, int routeLength) {
        System.out.println("Start point - " + trip.getStartPoint().getCity());
        System.out.println("Destination point - " + trip.getDestinationPoint().getCity());
        System.out.println("Route length is - " + routeLength + " km");
        System.out.print("Route will be laying through: ");
        routePoints.forEach(point -> System.out.print(point.getCity() + " "));
        calculateTravelTime(routeLength, trip);
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
            default:
                break;
        }
        System.out.println("Approximate travel time: " + routeLength * 60 / speed + " minutes.");
    }
}

