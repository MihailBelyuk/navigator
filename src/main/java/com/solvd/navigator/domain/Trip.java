package com.solvd.navigator.domain;

import java.util.List;

public class Trip {

    private Long id;
    private Point startPoint;
    private Point destinationPoint;
    private TravelType travelType;
    private List<Route> allRoutes;
    private ShortestRoute shortestRoute;
    private AlternativeRoute alternativeRoute;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(Point destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public ShortestRoute getShortestRoute() {
        return shortestRoute;
    }

    public void setShortestRoute(ShortestRoute shortestRoute) {
        this.shortestRoute = shortestRoute;
    }

    public AlternativeRoute getAlternativeRoute() {
        return alternativeRoute;
    }

    public void setAlternativeRoute(AlternativeRoute alternativeRoute) {
        this.alternativeRoute = alternativeRoute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Route> getAllRoutes() {
        return allRoutes;
    }

    public void setAllRoutes(List<Route> allRoutes) {
        this.allRoutes = allRoutes;
    }
}
