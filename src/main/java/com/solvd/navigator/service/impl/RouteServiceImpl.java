package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.RouteDaoImpl;
import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Trip;
import com.solvd.navigator.service.IRouteService;

import java.util.List;

public class RouteServiceImpl implements IRouteService {

    private final RouteDaoImpl routeDao;
    private final TripServiceImpl tripService;

    public RouteServiceImpl() {
        routeDao = new RouteDaoImpl();
        tripService = new TripServiceImpl();
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
    public Route findShortestRoute(Trip trip) {
        List<Trip> trips = tripService.getAll();
        Route route = null;
        for (Trip t : trips) {
            if (t.getShortestRoute().equals(trip.getShortestRoute())) {
                return t.getShortestRoute();
            }
        }
        // TODO: 9/30/2022 Dijkstra’s algorithm
        tripService.create(trip);
        return route;
    }

    @Override
    public Route findAlternativeRoute(Trip trip) {

        return null;
    }
}
