package com.solvd.navigator.service;

import com.solvd.navigator.domain.Navigator;

import java.util.List;

public interface INavigatorService {

    void create(Navigator navigator);

    Navigator getById(Long id);

    void update(Navigator navigator);

    void delete(Navigator navigator);

    List<Navigator> getAll();

}
