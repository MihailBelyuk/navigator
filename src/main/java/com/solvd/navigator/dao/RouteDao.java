package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Distance;
import com.solvd.navigator.domain.Route;

import java.util.List;

public interface RouteDao {

    void insert(Route route);

    Route findById(Long id);

    void update(Route route);

    void delete(Route route);

    List<Route> findAll();
}
