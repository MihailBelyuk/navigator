package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Distance;

import java.util.List;

public interface DistanceDao {

    void insert(Distance distance);

    Distance findById(Long id);

    void update(Distance distance);

    void delete(Distance distance);

    List<Distance> findAll();

}
