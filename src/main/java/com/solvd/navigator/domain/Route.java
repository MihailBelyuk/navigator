package com.solvd.navigator.domain;

import java.util.List;

public abstract class Route {

    private Long id;
    private Integer length;
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

    public Integer getLength() {
        return length;
    }

    public void setDistance() {
        this.length = 0;
        for (Distance distance : distances) {
            this.length = this.length + distance.getDistanceBetweenPoints();
        }
    }
}
