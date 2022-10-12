package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.ITripDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Trip;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class TripDaoImpl implements ITripDao {

    @Override
    public void insert(Trip trip, Long navigatorId) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ITripDao tripDao = session.getMapper(ITripDao.class);
            tripDao.insert(trip, navigatorId);
        }
    }

    @Override
    public Optional<Trip> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ITripDao tripDao = session.getMapper(ITripDao.class);
            return tripDao.findById(id);
        }
    }

    @Override
    public void update(Trip trip, Long navigatorId) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ITripDao tripDao = session.getMapper(ITripDao.class);
            tripDao.update(trip, navigatorId);
        }
    }

    @Override
    public void delete(Trip trip) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ITripDao tripDao = session.getMapper(ITripDao.class);
            tripDao.delete(trip);
        }
    }

    @Override
    public List<Trip> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ITripDao tripDao = session.getMapper(ITripDao.class);
            return tripDao.findAll();
        }
    }
}
