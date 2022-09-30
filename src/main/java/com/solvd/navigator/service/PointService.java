package com.solvd.navigator.service;

import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Trip;

import java.util.List;

public interface PointService {


    void create(Point point);

    Point getById(Long id);

    void update(Point point);

    void delete(Point point);

    List<Point> getAll();

}
