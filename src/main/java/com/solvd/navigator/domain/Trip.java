package com.solvd.navigator.domain;

import java.util.List;

public class Trip {

    private Long id;
    private TravelType travelType;
    private List<Route> allRoutes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public List<Route> getAllRoutes() {
        return allRoutes;
    }

    public void setAllRoutes(List<Route> allRoutes) {
        this.allRoutes = allRoutes;
    }
}
