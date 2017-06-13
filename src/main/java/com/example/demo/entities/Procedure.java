package com.example.demo.entities;



import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 13/02/17.
 */
public class Procedure implements Serializable {


    private int id;
    private String title_procedure;
    private String details_procedure;
    private String sector;

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

    public void setId(int id) {
        this.id = id;
    }



    public String getTitle_procedure() {
        return title_procedure;
    }

    public void setTitle_procedure(String title_procedure) {
        this.title_procedure = title_procedure;
    }

    public String getDetails_procedure() {
        return details_procedure;
    }

    public void setDetails_procedure(String details_procedure) {
        this.details_procedure = details_procedure;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Procedure() {
    }

    public Procedure(int id, String title_procedure) {
        this.id = id;
        this.title_procedure = title_procedure;
    }
}
