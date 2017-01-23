package com.pfagestionnote.model;

// Generated 11 avr. 2016 15:53:53 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Etudiant generated by hbm2java
 */
@Entity
@Table(name = "etudiant", catalog = "gestion_scolarite")
public class Etudiant implements java.io.Serializable {
	private Integer gId;
	private Integer id;
	private Groupe groupe;
	private String nom;
	private String prenom;
	private String email;
	private Long tel;
	private String login;
	private String mdp;
	private String numInsc;
	private Set<EtudiantHasMatiere> etudiantHasMatieres = new HashSet<EtudiantHasMatiere>(
			0);
	private Set<ReleveNote> releveNotes = new HashSet<ReleveNote>(0);

	public Etudiant() {
	}

	public Etudiant(Groupe groupe, String nom, String prenom, String email,
			Long tel, String login, String mdp, String numInsc,
			Set<EtudiantHasMatiere> etudiantHasMatieres,
			Set<ReleveNote> releveNotes, Integer gId) {
		this.groupe = groupe;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.login = login;
		this.mdp = mdp;
		this.gId = gId;
		this.numInsc = numInsc;
		this.etudiantHasMatieres = etudiantHasMatieres;
		this.releveNotes = releveNotes;
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
	@JoinColumn(name = "Groupe_id")
	public Groupe getGroupe() {
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
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

	@Column(name = "numInsc", length = 45)
	public String getNumInsc() {
		return this.numInsc;
	}

	public void setNumInsc(String numInsc) {
		this.numInsc = numInsc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etudiant")
	public Set<EtudiantHasMatiere> getEtudiantHasMatieres() {
		return this.etudiantHasMatieres;
	}

	public void setEtudiantHasMatieres(
			Set<EtudiantHasMatiere> etudiantHasMatieres) {
		this.etudiantHasMatieres = etudiantHasMatieres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etudiant")
	public Set<ReleveNote> getReleveNotes() {
		return this.releveNotes;
	}

	public void setReleveNotes(Set<ReleveNote> releveNotes) {
		this.releveNotes = releveNotes;
	}

	@Column(name = "gId")
	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

}
