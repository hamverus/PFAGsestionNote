package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.DirecteurEtude;



public interface DirecteurEtudeService {
	public void add(DirecteurEtude directeurEtude);
	public void edit(DirecteurEtude directeurEtude);
	public void delete(int directeurEtudeId);
	public DirecteurEtude getDirecteurEtude(int directeurEtudeId);
	public List getAllDirecteurEtude();
	public DirecteurEtude findUserByNumInsc(String numMatricule);
}
