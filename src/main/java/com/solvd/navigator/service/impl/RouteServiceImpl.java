package com.solvd.navigator.service.impl;

import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.service.RouteService;

import java.util.List;

public class RouteServiceImpl implements RouteService {

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
    public Route findShortestRoute(Trip trip, List<Trip> trips) {


        return null;
    }

    @Override
    public Route findAlternativeRoute(Trip trip, List<Trip> trips) {
        return null;
    }
}
