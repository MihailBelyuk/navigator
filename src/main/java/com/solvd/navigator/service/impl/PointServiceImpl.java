package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.PointDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.service.IPointService;

import java.util.List;

public class PointServiceImpl implements IPointService {

    private final PointDaoImpl pointDao;

    public PointServiceImpl(){
        pointDao = new PointDaoImpl();
    }

    @Override
    public void create(Point point) {

    }

    @Override
    public Point getById(Long id) {
        return null;
    }

    @Override
    public void update(Point point) {

    }

    @Override
    public void delete(Point point) {

    }

    @Override
    public List<Point> getAll() {
        return pointDao.findAll();
    }
}
