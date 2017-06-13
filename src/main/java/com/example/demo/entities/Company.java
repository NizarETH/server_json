package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 26/01/17.
 */
public class Company implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 9076087718948441844L;
	private int id;
    private String name;
    private String adresse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Company() {
    }

    public Company(int id, String name, String adresse) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
    }
}
