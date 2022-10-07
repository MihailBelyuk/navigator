package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.IRouteDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Route;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class RouteDaoImpl implements IRouteDao {

    @Override
    public void insert(Route route, Long navigatorId) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IRouteDao routeDao = session.getMapper(IRouteDao.class);
            routeDao.insert(route, navigatorId);
        }
    }

    @Override
    public Optional<Route> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IRouteDao routeDao = session.getMapper(IRouteDao.class);
            return routeDao.findById(id);
        }
    }

    @Override
    public void update(Route route, Long navigatorId) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IRouteDao routeDao = session.getMapper(IRouteDao.class);
            routeDao.update(route, navigatorId);
        }
    }

    @Override
    public void delete(Route route) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IRouteDao routeDao = session.getMapper(IRouteDao.class);
            routeDao.delete(route);
        }
    }

    @Override
    public List<Route> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            IRouteDao routeDao = session.getMapper(IRouteDao.class);
            return routeDao.findAll();
        }
    }
}
