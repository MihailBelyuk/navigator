package com.solvd.navigator.domain;

public class Point {

    private Long id;
    private String city;
    private Integer index;
    private Integer value;
    private String previousCity;
    private boolean begin;
    private boolean previous;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean isBegin() {
        return begin;
    }

    public void setBegin(boolean begin) {
        this.begin = begin;
    }

    public boolean isPrevious() {
        return previous;
    }

    public void setPrevious(boolean previous) {
        this.previous = previous;
    }

    public String getPreviousCity() {
        return previousCity;
    }

    public void setPreviousCity(String previousCity) {
        this.previousCity = previousCity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("id=").append(id);
        sb.append(", city='").append(city).append('\'');
        sb.append(", index=").append(index);
        sb.append(", value=").append(value);
        sb.append(", begin=").append(begin);
        sb.append(", previous=").append(previous);
        sb.append(", previousCity='").append(previousCity).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
