package com.solvd.navigator.domain;

import javax.swing.text.Segment;
import java.util.List;

public abstract class Route {

    private Long id;
    private List<Segment> segments;
    private Integer distance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
