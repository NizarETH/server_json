package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 26/01/17.
 */
public class Witness implements Serializable {

   
    /**
	 * 
	 */
	private static final long serialVersionUID = 6367732362406307999L;
	private int id;
    private String first_name;
    private String last_name;
    private Company company;
    private String function;
    private String contact_details;
    private String statement;
    private Infraction infraction;
    private String name;
    private String img_url;
    
    private List<FileItems> fileItemses;

    public List<FileItems> getFileItemses() {
        return fileItemses;
    }

    public void setFileItemses(List<FileItems> fileItemses) {
        this.fileItemses = fileItemses;
    }
    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
    public Infraction getInfraction() {
        return infraction;
    }

    public void setInfraction(Infraction infraction) {
        this.infraction = infraction;
    }

    public String getName() {
        if(name == null)
            name = getFirst_name()+" "+getLast_name() ;
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            name = getFirst_name()+" "+getLast_name();
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getContact_details() {
        return contact_details;
    }

    public void setContact_details(String contact_details) {
        this.contact_details = contact_details;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Witness() {
    }

    public Witness(int id, String first_name, String last_name, Company company, String function, String contact_details, String statement, Infraction infraction) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
        this.function = function;
        this.contact_details = contact_details;
        this.statement = statement;
        this.infraction = infraction;
    }
}
