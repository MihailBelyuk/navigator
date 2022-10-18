package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.IBusRouteDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.BusRoute;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class BusRouteDaoImpl implements IBusRouteDao {

    @Override
    public void insert(BusRoute busRoute) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IBusRouteDao busRouteDao = session.getMapper(IBusRouteDao.class);
            busRouteDao.insert(busRoute);
        }
    }

    @Override
    public Optional<BusRoute> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IBusRouteDao busRouteDao = session.getMapper(IBusRouteDao.class);
            return busRouteDao.findById(id);
        }
    }

    @Override
    public void update(BusRoute busRoute) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IBusRouteDao busRouteDao = session.getMapper(IBusRouteDao.class);
            busRouteDao.update(busRoute);
        }
    }

    @Override
    public void delete(BusRoute busRoute) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IBusRouteDao busRouteDao = session.getMapper(IBusRouteDao.class);
            busRouteDao.delete(busRoute);
        }
    }

    @Override
    public List<BusRoute> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IBusRouteDao busRouteDao = session.getMapper(IBusRouteDao.class);
            return busRouteDao.findAll();
        }
    }

    @Override
    public void insertBusRoutePoints(Long busRouteId, Long pointId) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IBusRouteDao busRouteDao = session.getMapper(IBusRouteDao.class);
            busRouteDao.insertBusRoutePoints(busRouteId, pointId);
        }
    }
}
