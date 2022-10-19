package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.IPointDao;
import com.solvd.navigator.dao.impl.PointDaoImpl;
import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.exception.ResourceNotFoundException;
import com.solvd.navigator.service.IPointService;

import java.util.List;

public class PointServiceImpl implements IPointService {

    private final IPointDao pointDao;

    public PointServiceImpl() {
        pointDao = new PointDaoImpl();
    }

    @Override
    public void create(Point point) {
        pointDao.insert(point);
    }

    @Override
    public Point getById(Long id) {
        return pointDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to retrieve point with id " + id));
    }

    @Override
    public void update(Point point) {
        pointDao.update(point);
    }

    @Override
    public void delete(Point point) {
        pointDao.delete(point);
    }

    @Override
    public List<Point> getAll() {
        return pointDao.findAll();
    }
}
