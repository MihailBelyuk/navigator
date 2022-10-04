package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Point;

import java.util.List;
import java.util.Optional;

public interface IPointDao {

    void insert(Point point);

    Optional<Point> findById(Long id);

    void update(Point point);

    void delete(Point point);

    List<Point> findAll();
}
