package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 26/01/17.
 */
public class State implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4373414032579466217L;

	private int id;

    private String title_state;


    public String getTitle_state() {
        return title_state;
    }

    public void setTitle_state(String title_state) {
        this.title_state = title_state;
    }

    public State(int id) {
        this.id = id;
    }

    public State() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
