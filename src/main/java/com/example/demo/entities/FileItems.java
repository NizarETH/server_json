package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 10/03/17.
 */
public class FileItems implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7652606305255977858L;
    private int id;
    private String path;
    private String date;
    private String extention;
    private String type;
    private String title;
    private String reference;
    private String source;
    private String liaison;

    private String name;
    private String size;
    private String description;
    private String niveau_doc;
    private String type_doc;
    private String niveau_conf;
    private String date_creation;
    private String date_modif;
    private String auteur_file;
    private String version;
    private Coordinates coordinates;
    private Author author;
    private Witness witness;
    private Accomplice accomplice;

    public String getLiaison() {
        return liaison;
    }

    public void setLiaison(String liaison) {
        this.liaison = liaison;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Witness getWitness() {
        return witness;
    }

    public void setWitness(Witness witness) {
        this.witness = witness;
    }

    public Accomplice getAccomplice() {
        return accomplice;
    }

    public void setAccomplice(Accomplice accomplice) {
        this.accomplice = accomplice;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNiveau_doc() {
        return niveau_doc;
    }

    public void setNiveau_doc(String niveau_doc) {
        this.niveau_doc = niveau_doc;
    }

    public String getType_doc() {
        return type_doc;
    }

    public void setType_doc(String type_doc) {
        this.type_doc = type_doc;
    }

    public String getNiveau_conf() {
        return niveau_conf;
    }

    public void setNiveau_conf(String niveau_conf) {
        this.niveau_conf = niveau_conf;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getDate_modif() {
        return date_modif;
    }

    public void setDate_modif(String date_modif) {
        this.date_modif = date_modif;
    }

    public String getAuteur_file() {
        return auteur_file;
    }

    public void setAuteur_file(String auteur_file) {
        this.auteur_file = auteur_file;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FileItems() {
    }

    public FileItems(int id, String path, String date, String type) {
        this.id = id;
        this.path = path;
        this.date = date;
        this.type = type;
    }
}
