package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Distance;
import com.solvd.navigator.domain.Point;

import java.util.List;

public interface PointDao {

    void insert(Point point);

    Point findById(Long id);

    void update(Point point);

    void delete(Point point);

    List<Point> findAll();
}
