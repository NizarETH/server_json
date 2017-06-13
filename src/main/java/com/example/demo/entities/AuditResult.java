package com.example.demo.entities;

import java.io.Serializable;

/**
 * Created by nizar on 05/06/17.
 */

public class AuditResult implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 4706530951446547225L;
	private long id;
    private long conformity_score;
    private long conformity_number_of_major;
    private long conformity_number_of_minor;
    private long conformity_number_of_yes;
    private long conformity_number_of_partial;
    private long conformity_number_of_no;
    private long conformity_number_of_no_apply;
    private long conformity_number_of_non_observation;
    private long operating_score;
    private long operating_number_of_yes;
    private long operating_number_of_partial;
    private long operating_number_of_no;
    private long operating_number_of_no_apply;
    private long operating_number_of_non_observation;
    private Audit audit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getConformity_score() {
        return conformity_score;
    }

    public void setConformity_score(long conformity_score) {
        this.conformity_score = conformity_score;
    }

    public long getConformity_number_of_major() {
        return conformity_number_of_major;
    }

    public void setConformity_number_of_major(long conformity_number_of_major) {
        this.conformity_number_of_major = conformity_number_of_major;
    }

    public long getConformity_number_of_minor() {
        return conformity_number_of_minor;
    }

    public void setConformity_number_of_minor(long conformity_number_of_minor) {
        this.conformity_number_of_minor = conformity_number_of_minor;
    }

    public long getConformity_number_of_yes() {
        return conformity_number_of_yes;
    }

    public void setConformity_number_of_yes(long conformity_number_of_yes) {
        this.conformity_number_of_yes = conformity_number_of_yes;
    }

    public long getConformity_number_of_partial() {
        return conformity_number_of_partial;
    }

    public void setConformity_number_of_partial(long conformity_number_of_partial) {
        this.conformity_number_of_partial = conformity_number_of_partial;
    }

    public long getConformity_number_of_no() {
        return conformity_number_of_no;
    }

    public void setConformity_number_of_no(long conformity_number_of_no) {
        this.conformity_number_of_no = conformity_number_of_no;
    }

    public long getConformity_number_of_no_apply() {
        return conformity_number_of_no_apply;
    }

    public void setConformity_number_of_no_apply(long conformity_number_of_no_apply) {
        this.conformity_number_of_no_apply = conformity_number_of_no_apply;
    }

    public long getConformity_number_of_non_observation() {
        return conformity_number_of_non_observation;
    }

    public void setConformity_number_of_non_observation(long conformity_number_of_non_observation) {
        this.conformity_number_of_non_observation = conformity_number_of_non_observation;
    }

    public long getOperating_score() {
        return operating_score;
    }

    public void setOperating_score(long operating_score) {
        this.operating_score = operating_score;
    }

    public long getOperating_number_of_yes() {
        return operating_number_of_yes;
    }

    public void setOperating_number_of_yes(long operating_number_of_yes) {
        this.operating_number_of_yes = operating_number_of_yes;
    }

    public long getOperating_number_of_partial() {
        return operating_number_of_partial;
    }

    public void setOperating_number_of_partial(long operating_number_of_partial) {
        this.operating_number_of_partial = operating_number_of_partial;
    }

    public long getOperating_number_of_no() {
        return operating_number_of_no;
    }

    public void setOperating_number_of_no(long operating_number_of_no) {
        this.operating_number_of_no = operating_number_of_no;
    }

    public long getOperating_number_of_no_apply() {
        return operating_number_of_no_apply;
    }

    public void setOperating_number_of_no_apply(long operating_number_of_no_apply) {
        this.operating_number_of_no_apply = operating_number_of_no_apply;
    }

    public long getOperating_number_of_non_observation() {
        return operating_number_of_non_observation;
    }

    public void setOperating_number_of_non_observation(long operating_number_of_non_observation) {
        this.operating_number_of_non_observation = operating_number_of_non_observation;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public AuditResult() {
    }

    public AuditResult(long id, long conformity_score, long conformity_number_of_major, long conformity_number_of_minor, long conformity_number_of_yes, long conformity_number_of_partial, long conformity_number_of_no, long conformity_number_of_no_apply, long conformity_number_of_non_observation, long operating_score, long operating_number_of_yes, long operating_number_of_partial, long operating_number_of_no, long operating_number_of_no_apply, long operating_number_of_non_observation, Audit audit) {

        this.id = id;
        this.conformity_score = conformity_score;
        this.conformity_number_of_major = conformity_number_of_major;
        this.conformity_number_of_minor = conformity_number_of_minor;
        this.conformity_number_of_yes = conformity_number_of_yes;
        this.conformity_number_of_partial = conformity_number_of_partial;
        this.conformity_number_of_no = conformity_number_of_no;
        this.conformity_number_of_no_apply = conformity_number_of_no_apply;
        this.conformity_number_of_non_observation = conformity_number_of_non_observation;
        this.operating_score = operating_score;
        this.operating_number_of_yes = operating_number_of_yes;
        this.operating_number_of_partial = operating_number_of_partial;
        this.operating_number_of_no = operating_number_of_no;
        this.operating_number_of_no_apply = operating_number_of_no_apply;
        this.operating_number_of_non_observation = operating_number_of_non_observation;
        this.audit = audit;
    }
}
