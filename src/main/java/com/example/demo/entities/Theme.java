package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 15/02/17.
 */
public class Theme implements Serializable{

    
    /**
	 * 
	 */
	private static final long serialVersionUID = -6984640195645238652L;
	private int id;
    private String title;
    private List<Question> questions;
    private boolean finish;
    private boolean open;

    private boolean stored;
    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Theme() {
    }

    public Theme(int id, String title, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.questions = questions;
    }
}
