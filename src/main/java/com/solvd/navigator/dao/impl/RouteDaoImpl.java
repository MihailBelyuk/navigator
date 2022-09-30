package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.dao.RouteDao;
import com.solvd.navigator.domain.Route;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RouteDaoImpl implements RouteDao {

    @Override
    public void insert(Route route) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            RouteDao routeDao = session.getMapper(RouteDao.class);
            routeDao.insert(route);
        }
    }

    @Override
    public Route findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            RouteDao routeDao = session.getMapper(RouteDao.class);
            return routeDao.findById(id);
        }
    }

    @Override
    public void update(Route route) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            RouteDao routeDao = session.getMapper(RouteDao.class);
            routeDao.update(route);
        }
    }

    @Override
    public void delete(Route route) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            RouteDao routeDao = session.getMapper(RouteDao.class);
            routeDao.delete(route);
        }
    }

    @Override
    public List<Route> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            RouteDao routeDao = session.getMapper(RouteDao.class);
            return routeDao.findAll();
        }
    }
}
