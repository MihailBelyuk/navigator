package com.solvd.navigator.service;

import com.solvd.navigator.domain.Route;
import com.solvd.navigator.domain.Trip;

public interface ICalculate {

    void calculateTravelTime(Integer routeLength, Trip trip);

}
