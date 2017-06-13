package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 15/02/17.
 */
public class Question implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4067372623279602930L;
	private int id;
    private String question;
    private String remarks;
    private String comment;
    private List<FileItems> fileItemses;

    public List<FileItems> getFileItemses() {
        return fileItemses;
    }

    public void setFileItemses(List<FileItems> fileItemses) {
        this.fileItemses = fileItemses;
    }

    public int getId() {
        return id;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Question() {
    }

    public Question(int id, String question, String remarks) {
        this.id = id;
        this.question = question;
        this.remarks = remarks;
    }
}
