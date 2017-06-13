package com.example.demo.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nizar on 20/01/17.
 */
public class ApplicationBean implements Serializable {

  
    private int id;


  
     private List<Infraction> infractions = new ArrayList<>();
     private List<Incident> incidents = new ArrayList<>();
     private List<Procedure> procedures = new ArrayList<>();
     private List<Audit> audits = new ArrayList<>();
     private List<Level_Safety> safeties = new ArrayList<>();

    public List<Level_Safety> getSafeties() {
        return safeties;
    }

    public void setSafeties(List<Level_Safety> safeties) {
        this.safeties = safeties;
    }

    public List<Audit> getAudits() {
        return audits;
    }

    public void setAudits(List<Audit> audits) {
        this.audits = audits;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    public List<Infraction> getInfractions() {
        return infractions;
    }

    public void setInfractions(List<Infraction> infractions) {
        this.infractions = infractions;
    }

    public ApplicationBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public ApplicationBean(int id, List<Infraction> infractions, List<Incident> incidents, List<Procedure> procedures, List<Audit> audits, List<Level_Safety> safeties) {
        this.id = id;
        this.infractions = infractions;
        this.incidents = incidents;
        this.procedures = procedures;
        this.audits = audits;
        this.safeties = safeties;
    }
}