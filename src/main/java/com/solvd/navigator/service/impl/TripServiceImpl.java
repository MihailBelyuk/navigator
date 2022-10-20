package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.ITripDao;
import com.solvd.navigator.dao.impl.TripDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.TravelType;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.domain.exception.ResourceNotFoundException;
import com.solvd.navigator.service.IBusRouteService;
import com.solvd.navigator.service.IPointService;
import com.solvd.navigator.service.IRouteService;
import com.solvd.navigator.service.ITripService;
import com.solvd.navigator.service.terminal.InputUtils;
import com.solvd.navigator.service.terminal.ScannerData;

import java.util.List;
import java.util.Scanner;

public class TripServiceImpl implements ITripService {

    private final IPointService pointService;
    private final IRouteService routeService;
    private final ITripDao tripDao;
    private final IBusRouteService busRouteService;

    public TripServiceImpl() {
        pointService = new PointServiceImpl();
        routeService = new RouteServiceImpl();
        tripDao = new TripDaoImpl();
        busRouteService = new BusRouteServiceImpl();
    }

    @Override
    public void create(Trip trip) {
        Long startPointId = trip.getStartPoint().getId();
        Long finishPointId = trip.getDestinationPoint().getId();
        Long routeId = trip.getRoute().getId();
        tripDao.insert(trip, 1L, startPointId, finishPointId, routeId);
    }

    @Override
    public Trip getById(Long id) {
        return tripDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to get trip with id " + id));
    }

    @Override
    public void update(Trip trip) {

    }

    @Override
    public void delete(Trip trip) {

    }

    @Override
    public List<Trip> getAll() {
        return tripDao.findAll();
    }

    @Override
    public Trip getTripParameters() {
        Scanner scanner = new Scanner(System.in);
        InputUtils inputUtils = new InputUtils();
        ScannerData scannerData = null;
        Trip trip = new Trip();
        List<Point> allPoints = pointService.getAll();
        Point startPoint = null;
        Point destinationPoint = null;
        while (startPoint == null || destinationPoint == null) {
            scannerData = inputUtils.inputData(scanner);
            scanner.nextLine();
            for (Point point : allPoints) {
                startPoint = getStartPoint(scannerData, startPoint, point);
            }
            for (Point point : allPoints) {
                destinationPoint = getDestinationPoint(scannerData, destinationPoint, point);
            }
            writeUnknownPointMessage(startPoint, destinationPoint);
        }
        buildTrip(scannerData, trip, startPoint, destinationPoint);
        checkTravelType(trip);
        scanner.close();
        return trip;
    }

    private Point getDestinationPoint(ScannerData scannerData, Point destinationPoint, Point point) {
        if (point.getCity().equals(scannerData.getDestinationPointInput())) {
            destinationPoint = point;
        }
        return destinationPoint;
    }

    private Point getStartPoint(ScannerData scannerData, Point startPoint, Point point) {
        if (point.getCity().equals(scannerData.getStartPointInput())) {
            startPoint = point;
        }
        return startPoint;
    }

    private void writeUnknownPointMessage(Point startPoint, Point destinationPoint) {
        if (startPoint == null || destinationPoint == null) {
            System.out.println("Unknown city start point or destination point. Please try again.");
        }
    }

    private void buildTrip(ScannerData scannerData, Trip trip, Point startPoint, Point destinationPoint) {
        trip.setStartPoint(startPoint);
        trip.setFinishPoint(destinationPoint);
        trip.setTravelType(scannerData.getTravelTypeInput());
    }

    private void checkTravelType(Trip trip) {
        Route route;
        if (trip.getTravelType().equals(TravelType.CAR)) {
            route = routeService.findRoute(trip);
            trip.setRoute(route);
            create(trip);
        } else if (trip.getTravelType().equals(TravelType.BUS)) {
            if (busRouteService.findBusRoute(trip) == null) {
                getTripParameters();
            }
        }
    }
}
