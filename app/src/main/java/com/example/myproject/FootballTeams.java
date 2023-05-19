package com.example.myproject;

public class FootballTeams {

    private String id;
    private String name;
    private String location;
    private int cost;
    private int size;

    public FootballTeams(String id, String name, String location, int cost, int size) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cost = cost;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}