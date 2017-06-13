package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 22/02/17.
 */
public class Sector implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private int level;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Sector() {
    }

    public Sector(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }
}
