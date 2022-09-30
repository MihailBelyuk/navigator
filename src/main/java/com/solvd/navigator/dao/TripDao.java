package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Trip;

import java.util.List;

public interface TripDao {

    void insert(Trip trip);

    Trip findById(Long id);

    void update(Trip trip);

    void delete(Trip trip);

    List<Trip> findAll();

}
