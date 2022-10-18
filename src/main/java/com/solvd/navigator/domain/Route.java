package com.solvd.navigator.domain;

import java.util.List;

public class Route {

    private Long id;
    private Integer distance;
    private List<Point> routePoints;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<Point> getRoutePoints() {
        return routePoints;
    }

    public void setRoutePoints(List<Point> routePoints) {
        this.routePoints = routePoints;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Route{");
        sb.append("id=").append(id);
        sb.append(", distance=").append(distance);
        sb.append(", routePoints=").append(routePoints);
        sb.append('}');
        return sb.toString();
    }
}
