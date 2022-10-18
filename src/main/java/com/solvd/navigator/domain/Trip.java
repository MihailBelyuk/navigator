package com.solvd.navigator.domain;

public class Trip {

    private Long id;
    private TravelType travelType;
    private Route route;
    private Point startPoint;
    private Point finishPoint;

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

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getDestinationPoint() {
        return finishPoint;
    }

    public void setFinishPoint(Point finishPoint) {
        this.finishPoint = finishPoint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trip{");
        sb.append("id=").append(id);
        sb.append(", travelType=").append(travelType);
        sb.append(", route=").append(route);
        sb.append(", startPoint=").append(startPoint);
        sb.append(", finishPoint=").append(finishPoint);
        sb.append('}');
        return sb.toString();
    }
}
