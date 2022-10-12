package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Navigator;
import com.solvd.navigator.domain.Point;

import java.util.List;
import java.util.Optional;

public interface INavigatorDao {

    void insert(Navigator navigator);

    Optional<Navigator> findById(Long id);

    void update(Navigator navigator);

    void delete(Navigator navigator);

    List<Navigator> findAll();
}
