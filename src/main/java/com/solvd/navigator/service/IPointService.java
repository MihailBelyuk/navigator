package com.solvd.navigator.service;

import com.solvd.navigator.domain.Point;

import java.util.List;

public interface IPointService {

    void create(Point point);

    Point getById(Long id);

    void update(Point point);

    void delete(Point point);

    List<Point> getAll();

}
