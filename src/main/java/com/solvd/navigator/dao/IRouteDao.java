package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Route;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

public interface IRouteDao {

    void insert(@Param("route") Route route, @Param("tripId") Long navigatorId);

    Optional<Route> findById(Long id);

    void update(@Param("route") Route route, @Param("tripId") Long navigatorId);

    void delete(Route route);

    List<Route> findAll();
}
