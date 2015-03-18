package com.skillsup.impl;

/**
 * Created by Валерия on 17.03.2015.
 */
public class Place {
    private String title;
    private double longtitude;
    private double latitude;
    private String description;


    public Place() {
    }

    public Place(String title, double longtitude, double latitude, String description) {
        this.title = title;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
