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
 * Matiere generated by hbm2java
 */
@Entity
@Table(name = "matiere", catalog = "gestion_scolarite")
public class Matiere implements java.io.Serializable {

	private int id;
	private int semestre ;
	private int mId;
	private Module module;
	private Enseignant enseignant;
	private String nom;
	private Double nbHeures;
	private Integer coefficient;
	private Set<EtudiantHasMatiere> etudiantHasMatieres = new HashSet<EtudiantHasMatiere>(
			0);

	public Matiere() {
	}

	public Matiere(int mId) {
		this.mId = mId;
	}

	public Matiere(int id,int mId, Module module, Enseignant enseignant, String nom,
			Double nbHeures, Integer coefficient,Integer semestre,
			Set<EtudiantHasMatiere> etudiantHasMatieres) {
		this.id = id;
		this.mId = mId;
		this.module = module;
		this.enseignant = enseignant;
		this.nom = nom;
		this.nbHeures = nbHeures;
		this.coefficient = coefficient;
		this.etudiantHasMatieres = etudiantHasMatieres;
		this.semestre=semestre;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Module_id")
	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Enseignant_id")
	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	@Column(name = "nom", length = 45)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "nbHeures", precision = 22, scale = 0)
	public Double getNbHeures() {
		return this.nbHeures;
	}

	public void setNbHeures(Double nbHeures) {
		this.nbHeures = nbHeures;
	}

	@Column(name = "coefficient")
	public Integer getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	@Column(name = "semestre")
	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matiere")
	public Set<EtudiantHasMatiere> getEtudiantHasMatieres() {
		return this.etudiantHasMatieres;
	}

	public void setEtudiantHasMatieres(
			Set<EtudiantHasMatiere> etudiantHasMatieres) {
		this.etudiantHasMatieres = etudiantHasMatieres;
	}
	
	@Column(name="mId")
	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}
	
	

}
