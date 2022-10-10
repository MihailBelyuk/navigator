package com.solvd.navigator.domain;

import java.util.Arrays;
import java.util.List;

public class Segment {

    private Long id;
    private List<Point> points;
    private String name;
    private Integer length;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Point> getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Segment{");
        sb.append("id=").append(id);
        sb.append(", points=").append(points);
        sb.append(", name='").append(name).append('\'');
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
