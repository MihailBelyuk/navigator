package com.solvd.navigator.domain;

import java.util.List;

public class BusRoute extends Route {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public Integer getDistance() {
        return super.getDistance();
    }

    @Override
    public void setDistance(Integer distance) {
        super.setDistance(distance);
    }

    @Override
    public List<Point> getRoutePoints() {
        return super.getRoutePoints();
    }

    @Override
    public void setRoutePoints(List<Point> routePoints) {
        super.setRoutePoints(routePoints);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
