package com.solvd.navigator.domain;

import java.util.List;

public abstract class Route {

    private List<Distance> distances;

    public List<Distance> getDistances() {
        return distances;
    }

    public void setDistances(List<Distance> distances) {
        this.distances = distances;
    }
}
