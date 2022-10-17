package com.solvd.navigator.service;

import com.solvd.navigator.domain.BusRoute;
import com.solvd.navigator.domain.Trip;

import java.util.List;

public interface IBusRouteService {

    void createBusRoute(BusRoute route);

    BusRoute getBusRouteById(Long id);

    void updateBusRoute(BusRoute route);

    void deleteBusRoute(BusRoute route);

    List<BusRoute> getAllBusRoutes();

    List<BusRoute> findBusRoute(Trip trip);

}
