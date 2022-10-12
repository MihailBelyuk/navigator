package com.solvd.navigator.domain;

public class Trip {

    private Long id;
    private TravelType travelType;
    private AlternativeRoute alternativeRoute;
    private ShortRoute shortRoute;
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

    public AlternativeRoute getAlternativeRoute() {
        return alternativeRoute;
    }

    public void setAlternativeRoute(AlternativeRoute alternativeRoute) {
        this.alternativeRoute = alternativeRoute;
    }

    public ShortRoute getShortRoute() {
        return shortRoute;
    }

    public void setShortRoute(ShortRoute shortRoute) {
        this.shortRoute = shortRoute;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(Point finishPoint) {
        this.finishPoint = finishPoint;
    }
}
