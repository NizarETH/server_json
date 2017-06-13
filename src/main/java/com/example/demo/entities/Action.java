package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 26/01/17.
 */
public class Action implements Serializable{

    private int id;

    private String action;
    private Infraction infraction;
    private String descision_maker;
    private String person_in_charge;
    private String date_echeance;

    public String getDate_echeance() {
        return date_echeance;
    }

    public void setDate_echeance(String date_echeance) {
        this.date_echeance = date_echeance;
    }

    public Action() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Infraction getInfraction() {
        return infraction;
    }

    public void setInfraction(Infraction infraction) {
        this.infraction = infraction;
    }

    public String getDescision_maker() {
        return descision_maker;
    }

    public void setDescision_maker(String descision_maker) {
        this.descision_maker = descision_maker;
    }

    public String getPerson_in_charge() {
        return person_in_charge;
    }

    public void setPerson_in_charge(String person_in_charge) {
        this.person_in_charge = person_in_charge;
    }

    public Action(int id, String action, Infraction infraction, String descision_maker, String person_in_charge) {
        this.id = id;

        this.infraction = infraction;
        this.descision_maker = descision_maker;
        this.person_in_charge = person_in_charge;
    }
}
