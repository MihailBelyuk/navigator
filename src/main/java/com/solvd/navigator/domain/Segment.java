package com.solvd.navigator.domain;

public class Segment {

    private Long id;
    private Integer[] points;
    private Integer length;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer[] getPoints() {
        return points;
    }

    public void setPoints(Integer[] points) {
        this.points = points;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
