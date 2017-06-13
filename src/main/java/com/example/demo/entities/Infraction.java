package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nizar on 26/01/17.
 */
public class Infraction implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6197238599876138205L;
	private Integer id;
    private String title_infraction;
    private State state;
    private int number;
    private boolean visited;
    private AreaofResponsibility areaofResponsibility;
    private String create_timestamp;
    private String update_timestamp;
    private String version;
    private List<Action> actions;


    private List<Author> authors;
    private Redactor redactor;
    private List<Accomplice> accomplices;
    private List<FileItems> fileItemses;
    private List<Witness> witness;
    private Observation observation;
    private Location location;
    private String AuthorModif;
    private boolean stored;


    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<FileItems> getFileItemses() {
        return fileItemses;
    }

    public void setFileItemses(List<FileItems> fileItemses) {
        this.fileItemses = fileItemses;
    }

    public String getAuthorModif() {
        return AuthorModif;
    }

    public void setAuthorModif(String authorModif) {
        AuthorModif = authorModif;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }




    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }



    public List<Accomplice> getAccomplices() {
        return accomplices;
    }

    public void setAccomplices(List<Accomplice> accomplices) {
        this.accomplices = accomplices;
    }

    public Redactor getRedactor() {
        return redactor;
    }

    public void setRedactor(Redactor redactor) {
        this.redactor = redactor;
    }

    public List<Witness> getWitness() {
        return witness;
    }

    public void setWitness(List<Witness> witness) {
        this.witness = witness;
    }

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle_infraction() {
        return title_infraction;
    }

    public void setTitle_infraction(String title_infraction) {
        this.title_infraction = title_infraction;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AreaofResponsibility getAreaofResponsibility() {
        return areaofResponsibility;
    }

    public void setAreaofResponsibility(AreaofResponsibility areaofResponsibility) {
        this.areaofResponsibility = areaofResponsibility;
    }

    public String getCreate_timestamp() {
        return create_timestamp;
    }

    public void setCreate_timestamp(String create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    public String getUpdate_timestamp() {
        return update_timestamp;
    }

    public void setUpdate_timestamp(String update_timestamp) {
        this.update_timestamp = update_timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Infraction() {
    }

    public Infraction(Integer id, String title_infraction, State state, int number, boolean visited,
    		AreaofResponsibility areaofResponsibility, String create_timestamp, String update_timestamp,
    		String version, List<Action> actions, List<Author> authors, Redactor redactor,
    		List<Accomplice> accomplices, List<FileItems> fileItemses, List<Witness> witness,
    		Observation observation, Location location, boolean stored) {
        this.id = id;
        this.title_infraction = title_infraction;
        this.state = state;
        this.number = number;
        this.visited = visited;
        this.areaofResponsibility = areaofResponsibility;
        this.create_timestamp = create_timestamp;
        this.update_timestamp = update_timestamp;
        this.version = version;
        this.actions = actions;
        this.authors = authors;
        this.redactor = redactor;
        this.accomplices = accomplices;
        this.fileItemses = fileItemses;
        this.witness = witness;
        this.observation = observation;
        this.location = location;
        this.stored = stored;
    }
}
