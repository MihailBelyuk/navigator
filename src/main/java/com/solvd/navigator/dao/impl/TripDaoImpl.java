package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.dao.TripDao;
import com.solvd.navigator.domain.Trip;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TripDaoImpl implements TripDao {

    @Override
    public void insert(Trip trip) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            TripDao tripDao = session.getMapper(TripDao.class);
            tripDao.insert(trip);
        }
    }

    @Override
    public Trip findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            TripDao tripDao = session.getMapper(TripDao.class);
            return tripDao.findById(id);
        }
    }

    @Override
    public void update(Trip trip) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            TripDao tripDao = session.getMapper(TripDao.class);
            tripDao.update(trip);
        }
    }

    @Override
    public void delete(Trip trip) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            TripDao tripDao = session.getMapper(TripDao.class);
            tripDao.delete(trip);
        }
    }

    @Override
    public List<Trip> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            TripDao tripDao = session.getMapper(TripDao.class);
            return tripDao.findAll();
        }
    }
}
