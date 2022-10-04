package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.IDistanceDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Distance;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class DistanceDaoImpl implements IDistanceDao {

    @Override
    public void insert(Distance distance) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IDistanceDao distanceDao = session.getMapper(IDistanceDao.class);
            distanceDao.insert(distance);
        }
    }

    @Override
    public Optional<Distance> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IDistanceDao distanceDao = session.getMapper(IDistanceDao.class);
            return distanceDao.findById(id);
        }
    }

    @Override
    public void update(Distance distance) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IDistanceDao distanceDao = session.getMapper(IDistanceDao.class);
            distanceDao.update(distance);
        }
    }

    @Override
    public void delete(Distance distance) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IDistanceDao distanceDao = session.getMapper(IDistanceDao.class);
            distanceDao.delete(distance);
        }
    }

    @Override
    public List<Distance> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IDistanceDao distanceDao = session.getMapper(IDistanceDao.class);
            return distanceDao.findAll();
        }
    }
}
