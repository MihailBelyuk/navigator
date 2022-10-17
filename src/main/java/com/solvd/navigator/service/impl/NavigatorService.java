package com.solvd.navigator.service.impl;

import com.solvd.navigator.dao.impl.NavigatorDaoImpl;
import com.solvd.navigator.domain.Navigator;
import com.solvd.navigator.exception.ResourceNotFoundException;
import com.solvd.navigator.service.INavigatorService;

import java.util.List;

public class NavigatorService implements INavigatorService {

    private final NavigatorDaoImpl navigatorDao;

    public NavigatorService() {
        navigatorDao = new NavigatorDaoImpl();
    }

    @Override
    public void create(Navigator navigator) {
        navigatorDao.insert(navigator);
    }

    @Override
    public Navigator getById(Long id) {
        return navigatorDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failed to retrieve navigator with id " + id));
    }

    @Override
    public void update(Navigator navigator) {
        navigatorDao.update(navigator);
    }

    @Override
    public void delete(Navigator navigator) {
        navigatorDao.delete(navigator);
    }

    @Override
    public List<Navigator> getAll() {
        return navigatorDao.findAll();
    }
}
