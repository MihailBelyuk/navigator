package com.solvd.navigator.service;

import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Trip;

import java.util.List;

public interface IRouteService {

    void create(Route route);

    Route getById(Long id);

    void update(Route route);

    void delete(Route route);

    List<Route> getAll();

    void findShortestRoute();

    Route findAlternativeRoute(Trip trip);
}
