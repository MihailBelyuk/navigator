package com.solvd.navigator.dao.impl;

import com.solvd.navigator.dao.INavigatorDao;
import com.solvd.navigator.dao.MyBatisConfig;
import com.solvd.navigator.domain.Navigator;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class NavigatorDaoImpl implements INavigatorDao {

    @Override
    public void insert(Navigator navigator) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            INavigatorDao navigatorDao = session.getMapper(INavigatorDao.class);
            navigatorDao.insert(navigator);
        }
    }

    @Override
    public Optional<Navigator> findById(Long id) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            INavigatorDao navigatorDao = session.getMapper(INavigatorDao.class);
            return navigatorDao.findById(id);
        }
    }

    @Override
    public void update(Navigator navigator) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            INavigatorDao navigatorDao = session.getMapper(INavigatorDao.class);
            navigatorDao.update(navigator);
        }
    }

    @Override
    public void delete(Navigator navigator) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            INavigatorDao navigatorDao = session.getMapper(INavigatorDao.class);
            navigatorDao.delete(navigator);
        }
    }

    @Override
    public List<Navigator> findAll() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            INavigatorDao navigatorDao = session.getMapper(INavigatorDao.class);
            return navigatorDao.findAll();
        }
    }
}
