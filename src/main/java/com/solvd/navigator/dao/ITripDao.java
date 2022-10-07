package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Trip;

import java.util.List;
import java.util.Optional;

public interface ITripDao {

    void insert(Trip trip, Long navigatorId);

    Optional<Trip> findById(Long id);

    void update(Trip trip, Long navigatorId);

    void delete(Trip trip);

    List<Trip> findAll();

}
