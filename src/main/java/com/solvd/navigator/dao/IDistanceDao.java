package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Distance;

import java.util.List;
import java.util.Optional;

public interface IDistanceDao {

    void insert(Distance distance);

    Optional<Distance> findById(Long id);

    void update(Distance distance);

    void delete(Distance distance);

    List<Distance> findAll();

}
