package com.solvd.navigator.domain;

public class Distance {

    private Long id;
    private Point firstPoint;
    private Point secondPoint;
    private Integer distanceBetweenPoints;

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Integer getDistanceBetweenPoints() {
        return distanceBetweenPoints;
    }

    public void setDistanceBetweenPoints(Integer distanceBetweenPoints) {
        this.distanceBetweenPoints = distanceBetweenPoints;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
