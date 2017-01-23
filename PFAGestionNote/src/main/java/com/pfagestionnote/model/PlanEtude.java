package com.pfagestionnote.model;

// Generated 11 avr. 2016 15:53:53 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlanEtude generated by hbm2java
 */
@Entity
@Table(name = "plan_etude", catalog = "gestion_scolarite")
public class PlanEtude implements java.io.Serializable {
	
	private int sId;
	private int id;
	private String annee;
	private Set<Section> sections = new HashSet<Section>(0);

	public PlanEtude() {
	}
	
	public PlanEtude(int sId) {
		this.sId = sId;
	}

	public PlanEtude(int id, String annee, Set<Section> sections,int sId) {
		this.id = id;
		this.sId = sId;
		this.annee = annee;
		this.sections = sections;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "annee", length = 15)
	public String getAnnee() {
		return this.annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planEtude")
	public Set<Section> getSections() {
		return this.sections;
	}

	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}
	
	@Column(name = "sId")
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

}