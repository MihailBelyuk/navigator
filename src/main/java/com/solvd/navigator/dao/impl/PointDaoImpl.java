package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.dao.PointDao;
import com.solvd.navigator.domain.Point;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PointDaoImpl implements PointDao {

    @Override
    public void insert(Point point) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            PointDao pointDao = session.getMapper(PointDao.class);
            pointDao.insert(point);
        }
    }

    @Override
    public Point findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            PointDao pointDao = session.getMapper(PointDao.class);
            return pointDao.findById(id);
        }
    }

    @Override
    public void update(Point point) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            PointDao pointDao = session.getMapper(PointDao.class);
            pointDao.update(point);
        }
    }

    @Override
    public void delete(Point point) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            PointDao pointDao = session.getMapper(PointDao.class);
            pointDao.delete(point);
        }
    }

    @Override
    public List<Point> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            PointDao pointDao = session.getMapper(PointDao.class);
            return pointDao.findAll();
        }
    }
}
