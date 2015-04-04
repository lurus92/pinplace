package com.sampi.luigi.pinplace;

import java.io.Serializable;

/**
 * Created by Luigi on 24/03/2015.
 */

public class Place implements Serializable {
    private String name;
    private int icon;
    private String description;
    private double lat;
    private double lng;

    public Place(String name, int icon, String description, double lat, double lng) {
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }
}
