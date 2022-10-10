package com.solvd.navigator.domain;

public class Point {

    private Long id;
    private String city;
    private Integer index;
    private Integer value;
    private  boolean begin;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("id=").append(id);
        sb.append(", city='").append(city).append('\'');
        sb.append(", index=").append(index);
        sb.append(", value=").append(value);
        sb.append(", begin=").append(begin);
        sb.append('}');
        return sb.toString();
    }
}
