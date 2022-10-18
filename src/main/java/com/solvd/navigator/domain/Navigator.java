package com.solvd.navigator.domain;

import com.solvd.navigator.service.ITripService;
import com.solvd.navigator.service.impl.TripServiceImpl;

import java.util.List;

public class Navigator {

    private Long id;
    private String name;
    private List<Trip> trips;

    public Navigator() {
        ITripService tripService = new TripServiceImpl();
        System.out.println("Welcome to NaviLaba Navigator!!\nTo find necessary route enter trip parameters.");
        tripService.getTripParameters();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Navigator{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", trips=").append(trips);
        sb.append('}');
        return sb.toString();
    }
}


