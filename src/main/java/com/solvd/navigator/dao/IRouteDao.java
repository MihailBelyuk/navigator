package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Route;

import java.util.List;
import java.util.Optional;

public interface IRouteDao {

    void insert(Route route);

    Optional<Route> findById(Long id);

    void update(Route route);

    void delete(Route route);

    List<Route> findAll();
}
