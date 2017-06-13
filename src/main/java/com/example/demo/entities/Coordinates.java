package com.example.demo.entities;

import java.io.Serializable;

public class Coordinates implements Serializable{

   
    /**
	 * 
	 */
	private static final long serialVersionUID = -1975642754512376942L;

	private int id;

	private double latitude;
	private double longitude;

    public Coordinates() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Coordinates(int id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
