package com.example.demo.entities;



import java.io.Serializable;

/**
 * Created by nizar on 22/02/17.
 */
public class Domain implements Serializable {


    private int id;
    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Domain(int id, int level) {
        this.id = id;
        this.level = level;
    }

    public Domain() {
    }
}
