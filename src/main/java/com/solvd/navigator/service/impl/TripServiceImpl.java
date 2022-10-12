package com.solvd.navigator.service.impl;

import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.service.ITripService;
import com.solvd.navigator.terminal.InputUtils;
import com.solvd.navigator.terminal.ScannerData;

import java.util.List;

public class TripServiceImpl implements ITripService {

    @Override
    public void create(Trip trip) {

    }

    @Override
    public Trip getById(Long id) {
        return null;
    }

    @Override
    public void update(Trip trip) {

    }

    @Override
    public void delete(Trip trip) {

    }

    @Override
    public List<Trip> getAll() {
        return null;
    }

    @Override
    public Trip getTripParameters() {
        InputUtils inputUtils = new InputUtils();
        ScannerData scannerData = inputUtils.inputData();
        Trip trip = new Trip();
        Point startPoint = new Point();
        Point finishPoint = new Point();
        startPoint.setCity(scannerData.getStartPointInput());
        finishPoint.setCity(scannerData.getEndPointInput());
        trip.setStartPoint(startPoint);
        trip.setFinishPoint(finishPoint);
        trip.setTravelType(scannerData.getTravelType());
//        System.out.println("Start point - " + scannerData.getStartPointInput());
//        System.out.println("Destination point - " + scannerData.getEndPointInput());
        return trip;
    }
}
