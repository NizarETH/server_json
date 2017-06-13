package com.example.demo.entities;



import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 22/02/17.
 */
public class Level_Safety implements Serializable {


    private int id;
    private List<Domain> domains;
    private List<Sector> sectors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Domain> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain> domains) {
        this.domains = domains;
    }

    public List<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }

    public Level_Safety() {
    }

    public Level_Safety(int id, List<Domain> domains, List<Sector> sectors) {
        this.id = id;
        this.domains = domains;
        this.sectors = sectors;
    }
}
