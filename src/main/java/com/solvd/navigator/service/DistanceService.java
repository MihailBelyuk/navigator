package com.solvd.navigator.service;

import com.solvd.navigator.domain.Distance;
import com.solvd.navigator.domain.Trip;

import java.util.List;
import java.util.zip.DeflaterInputStream;

public interface DistanceService {


    void create(Distance distance);

    Distance getById(Long id);

    void update(Distance distance);

    void delete(Distance distance);

    List<Distance> getAll();
}
