package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 26/01/17.
 */
public class AreaofResponsibility implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1817364928863709568L;

	private int id;// = RealmAutoIncrement.getInstance().getNextIdFromModel(AreaofResponsibility.class);

    private String title_area;
    private int level;
    
    

	public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTitle_area() {
        return title_area;
    }

    public void setTitle_area(String title_area) {
        this.title_area = title_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AreaofResponsibility() {
    }

    public AreaofResponsibility(int id) {
        this.id = id;
    }

	public AreaofResponsibility(int id, String title_area, int level) {
		super();
		this.id = id;
		this.title_area = title_area;
		this.level = level;
	}
    
}
