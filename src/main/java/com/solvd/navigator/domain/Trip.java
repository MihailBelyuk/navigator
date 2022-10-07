package com.solvd.navigator.domain;

import java.util.List;

public class Trip {

    private Long id;
    private TravelType travelType;
    private AlternativeRoute alternativeRoute;
    private ShortRoute shortRoute;
    private Point pointStart;
    private Point pointEnd;

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

    public Point getPointStart() {
        return pointStart;
    }

    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }
}
