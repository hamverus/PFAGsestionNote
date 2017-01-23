package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Etudiant;



public interface EtudiantService {
	public void add(Etudiant etudiant);
	public void edit(Etudiant etudiant);
	public void delete(int etudiantId);
	public Etudiant getEtudiant(int etudiantId);
	public List getAllEtudiant();
	public Etudiant findUserByNumInsc(String numInsc);
}
