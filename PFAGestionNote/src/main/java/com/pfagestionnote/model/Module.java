package com.pfagestionnote.model;

// Generated 11 avr. 2016 15:53:53 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Module generated by hbm2java
 */
@Entity
@Table(name = "module", catalog = "gestion_scolarite")
public class Module implements java.io.Serializable {

	private int id;
	private int sId;
	private String nom;
	private Section section;
	private Integer coefficient;
	private Set<Matiere> matieres = new HashSet<Matiere>(0);

	public Module() {
	}

	public Module(int sId) {
		this.sId = sId;
	}

	public Module(int id,String nom, Section section, Integer coefficient,
			Set<Matiere> matieres) {
		this.id = id;
		this.nom=nom;
		this.section = section;
		this.coefficient = coefficient;
		this.matieres = matieres;
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
	
	@Column(name="nom",length = 45)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Section_id")
	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	@Column(name = "coefficient")
	public Integer getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "module")
	public Set<Matiere> getMatieres() {
		return this.matieres;
	}

	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}

	@Column(name="sId")
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	
}