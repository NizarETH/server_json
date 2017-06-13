package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 21/02/17.
 */
public class Conformity implements Serializable{

  
    /**
	 * 
	 */
	private static final long serialVersionUID = 2257056199698641334L;
	private int id;
    private Theme theme;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Conformity() {
    }

    public Conformity(int id, Theme theme) {
        this.id = id;
        this.theme = theme;
    }
}
