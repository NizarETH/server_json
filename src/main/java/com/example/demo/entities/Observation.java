package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 26/01/17.
 */
public class Observation implements Serializable {


    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4705783308692111875L;
	private int id ;
    private String timestamp;
    private String type;
    private String circumstances;
    private Location location;
    private Sector sector;
    private Infraction infraction;
    private List<FileItems> fileItemses;

    public List<FileItems> getFileItemses() {
        return fileItemses;
    }

    public void setFileItemses(List<FileItems> fileItemses) {
        this.fileItemses = fileItemses;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCircumstances() {
        return circumstances;
    }

    public void setCircumstances(String circumstances) {
        this.circumstances = circumstances;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Infraction getInfraction() {
        return infraction;
    }

    public void setInfraction(Infraction infraction) {
        this.infraction = infraction;
    }

    public Observation() {
    }

    public Observation(int id, String timestamp, String type, String circumstances, Location location, Infraction infraction) {
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.circumstances = circumstances;
        this.location = location;
        this.infraction = infraction;
    }
}
