package com.pfagestionnote.model;

// Generated 11 avr. 2016 15:53:53 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ChefDepartement generated by hbm2java
 */
@Entity
@Table(name = "chef_departement", catalog = "gestion_scolarite")
public class ChefDepartement implements java.io.Serializable {

	private Integer id;
	private Departement departement;
	private String nom;
	private String prenom;
	private String email;
	private Long tel;
	private String login;
	private String mdp;
	private String numMatricule;

	public ChefDepartement() {
	}

	public ChefDepartement(Departement departement, String nom, String prenom,
			String email, Long tel, String login, String mdp,
			String numMatricule) {
		this.departement = departement;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.login = login;
		this.mdp = mdp;
		this.numMatricule = numMatricule;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Departement_id")
	public Departement getDepartement() {
		return this.departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	@Column(name = "nom", length = 45)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 45)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tel", precision = 10, scale = 0)
	public Long getTel() {
		return this.tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	@Column(name = "login", length = 45)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "mdp", length = 45)
	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Column(name = "numMatricule", length = 45)
	public String getNumMatricule() {
		return this.numMatricule;
	}

	public void setNumMatricule(String numMatricule) {
		this.numMatricule = numMatricule;
	}

}
