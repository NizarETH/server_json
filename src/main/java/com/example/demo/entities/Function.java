package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 21/02/17.
 */
public class Function implements Serializable {

  
    /**
	 * 
	 */
	private static final long serialVersionUID = -35494044287471146L;
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

    public Function() {
    }

    public Function(int id, Theme theme) {
        this.id = id;
        this.theme = theme;
    }
}
