package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.DistanceDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Distance;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DistanceDaoImpl implements DistanceDao {

    @Override
    public void insert(Distance distance) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            DistanceDao distanceDao = session.getMapper(DistanceDao.class);
            distanceDao.insert(distance);
        }
    }

    @Override
    public Distance findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            DistanceDao distanceDao = session.getMapper(DistanceDao.class);
            return distanceDao.findById(id);
        }
    }

    @Override
    public void update(Distance distance) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            DistanceDao distanceDao = session.getMapper(DistanceDao.class);
            distanceDao.update(distance);
        }
    }

    @Override
    public void delete(Distance distance) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            DistanceDao distanceDao = session.getMapper(DistanceDao.class);
            distanceDao.delete(distance);
        }
    }

    @Override
    public List<Distance> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            DistanceDao distanceDao = session.getMapper(DistanceDao.class);
            return distanceDao.findAll();
        }
    }
}
