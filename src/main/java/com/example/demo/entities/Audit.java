package com.example.demo.entities;


import java.io.Serializable;
import java.util.List;


/**
 * Created by nizar on 15/02/17.
 */
public class Audit implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7803393579665381755L;
	private int id;
    private int number;
    private String title;
    private List<Conformity> conformities;
    private List<Function> functions;
    private List<FileItems> fileItemses;
    private boolean finish;
    private boolean open;
    private boolean stored;

    private State state;
    private AreaofResponsibility areaofResponsibility;
    private Redactor redactor;
    private boolean cancel;
    private Coordinates coordinates;
    private String editor;
    private String update_timestamp;
    private String version;
    private String create_timestamp;


    long type;

    AuditResult auditResult;

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public AuditResult getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(AuditResult auditResult) {
        this.auditResult = auditResult;
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

    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
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

    public String getEditor() {
        return editor;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public AreaofResponsibility getAreaofResponsibility() {
        return areaofResponsibility;
    }

    public void setAreaofResponsibility(AreaofResponsibility areaofResponsibility) {
        this.areaofResponsibility = areaofResponsibility;
    }



    public Redactor getRedactor() {
        return redactor;
    }

    public void setRedactor(Redactor redactor) {
        this.redactor = redactor;
    }

    public List<FileItems> getFileItemses() {
        return fileItemses;
    }

    public void setFileItemses(List<FileItems> fileItemses) {
        this.fileItemses = fileItemses;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public boolean isOpen() {
        return open;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
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

    public List<Conformity> getConformities() {
        return conformities;
    }

    public void setConformities(List<Conformity> conformities) {
        this.conformities = conformities;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public Audit() {
    }

    public Audit(int id, List<Conformity> conformities, List<Function> functions) {
        this.id = id;
        this.conformities = conformities;
        this.functions = functions;
    }
}
