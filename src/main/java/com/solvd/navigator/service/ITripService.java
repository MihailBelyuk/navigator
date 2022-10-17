package com.solvd.navigator.service;

import com.solvd.navigator.domain.Trip;

import java.util.List;

public interface ITripService {

    void create(Trip trip);

    Trip getById(Long id);

    void update(Trip trip);

    void delete(Trip trip);

    List<Trip> getAll();

    Trip getTripParameters();

}
