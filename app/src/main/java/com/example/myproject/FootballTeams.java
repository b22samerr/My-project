package com.example.myproject;

public class FootballTeams {
    private String name;
    private String location;
    private Integer size;
    private Integer cost;

    @Override
    public String toString() {
        return "FootballTeams{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
