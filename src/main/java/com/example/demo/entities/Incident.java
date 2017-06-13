package com.example.demo.entities;



import java.io.Serializable;

/**
 * Created by nizar on 09/02/17.
 */
public class Incident implements Serializable {


    private int id;
    private String title_incident;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Incident() {
    }

    public String getTitle_incident() {
        return title_incident;
    }

    public void setTitle_incident(String title_incident) {
        this.title_incident = title_incident;
    }

    public Incident(int id, String title_incident) {
        this.id = id;
        this.title_incident = title_incident;
    }
}
