package com.solvd.navigator.service;

import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Trip;

import java.util.List;

public interface RouteService {

    void create(Route route);

    Route getById(Long id);

    void update(Route route);

    void delete(Route route);

    List<Route> getAll();

    Route findShortestRoute(Trip trip, List<Trip> trips);

    Route findAlternativeRoute(Trip trip,  List<Trip> trips);
}
