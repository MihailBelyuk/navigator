package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Point;
import com.solvd.navigator.domain.Route;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

public interface IRouteDao {

    void insert(Route route);

    Optional<Route> findById(Long id);

    void update(Route route);

    void delete(Route route);

    List<Route> findAll();

    void insertRoutePoints(@Param("route") Route route, @Param("point") Point point);

}
