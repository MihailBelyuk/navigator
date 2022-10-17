package com.solvd.navigator.dao;

import com.solvd.navigator.domain.BusRoute;
import com.solvd.navigator.domain.Route;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

public interface IBusRouteDao {

    void insert(BusRoute busRoute);

    Optional<BusRoute> findById(Long id);

    void update(BusRoute busRoute);

    void delete(BusRoute busRoute);

    List<BusRoute> findAll();

    void insertBusRoutePoints(@Param("busRouteId") Long busRouteId, @Param("pointId") Long pointId);
}
