package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.RouteDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Segment;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.service.IRouteService;
import com.solvd.navigator.terminal.InputUtils;
import com.solvd.navigator.terminal.ScannerData;

import java.util.List;

public class RouteServiceImpl implements IRouteService {

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
    public void findShortestRoute(Trip trip) {
        InputUtils inputUtils = new InputUtils();
        ScannerData scannerData = inputUtils.inputData();
        List<Segment> allSegments = segmentService.getAll();
        List<Point> allPoints = pointService.getAll();
        Point processedPoint = null;
        Point currentPoint = null;

        Point endPoint = null;
        for (Point point : allPoints) {
            if (point.getCity().equals(scannerData.getStartPointInput())) {
                point.setBegin(true);
                point.setValue(1);
            }
            if (point.getCity().equals(scannerData.getEndPointInput())) {
                endPoint = point;
            }
        }
        while (endPoint.getValue() == 0) {
            int pointValue = 100000;
            for (Point point : allPoints) {
                if (point.getValue() == 0) { // if start point
                    for (Segment segment : allSegments) {
                        for (int j = 0; j < segment.getPoints().length; j++) {
                            if (segment.getPoints()[j].getCity().equals(point.getCity())) {
                                if (j == 0) {
                                    processedPoint = segment.getPoints()[j + 1];
                                } else {
                                    processedPoint = segment.getPoints()[j - 1];
                                }
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
        System.out.println("Start point - " + scannerData.getStartPointInput());
        System.out.println("Destination point - " + scannerData.getEndPointInput());
        System.out.println();
        System.out.println("Route length is - " + (endPoint.getValue() - 1));
    }

    @Override
    public Route findAlternativeRoute(Trip trip) {

        return null;
    }
}
