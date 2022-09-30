package com.solvd.navigator.domain;

import java.util.List;

public abstract class Route {

    private Long id;
    private Integer distance;
    private List<Distance> distances;

    public List<Distance> getDistances() {
        return distances;
    }

    public void setDistances(List<Distance> distances) {
        this.distances = distances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance() {
        this.distance = 0;
        for (Distance distance : distances) {
            this.distance = this.distance + distance.getDistance();
        }
    }
}
