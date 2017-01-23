package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Enseignant;



public interface EnseignantService {
	public void add(Enseignant enseignant);
	public void edit(Enseignant enseignant);
	public void delete(int enseignantId);
	public Enseignant getEnseignant(int enseignantId);
	public List getAllEnseignant();
	public Enseignant findUserByNumInsc(String numMatricule);
}
