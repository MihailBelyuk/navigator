package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.IPointDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Point;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class PointDaoImpl implements IPointDao {

    @Override
    public void insert(Point point) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IPointDao pointDao = session.getMapper(IPointDao.class);
            pointDao.insert(point);
        }
    }

    @Override
    public Optional<Point> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IPointDao pointDao = session.getMapper(IPointDao.class);
            return pointDao.findById(id);
        }
    }

    @Override
    public void update(Point point) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IPointDao pointDao = session.getMapper(IPointDao.class);
            pointDao.update(point);
        }
    }

    @Override
    public void delete(Point point) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IPointDao pointDao = session.getMapper(IPointDao.class);
            pointDao.delete(point);
        }
    }

    @Override
    public List<Point> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IPointDao pointDao = session.getMapper(IPointDao.class);
            return pointDao.findAll();
        }
    }
}
