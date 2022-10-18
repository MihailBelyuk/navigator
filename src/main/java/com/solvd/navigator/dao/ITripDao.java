package com.solvd.navigator.dao;

import com.solvd.navigator.domain.Trip;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

public interface ITripDao {

    void insert(@Param("trip") Trip trip,@Param("navigatorId") Long navigatorId,
                @Param("startPointId") Long startPointId,@Param("finishPointId") Long finishPointId,
                @Param("routeId") Long routeId);

    Optional<Trip> findById(Long id);

    void delete(Trip trip);

    List<Trip> findAll();

}
