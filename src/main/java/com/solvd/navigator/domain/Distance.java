package com.solvd.navigator.domain;

public class Distance {

    private Long id;
    private Point pointA;
    private Point pointB;
    private Integer distanceBetweenPoints;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
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
