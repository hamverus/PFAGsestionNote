package com.pfagestionnote.service;

import java.util.List;




import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Coordinateur;



public interface CoordinateurService {
	public void add(Coordinateur coordinateur);
	public void edit(Coordinateur coordinateur);
	public void delete(int coordinateurId);
	public Coordinateur getCoordinateur(int coordinateurId);
	public List getAllCoordinateur();
	public Coordinateur findUserByNumInsc(String numMatricule);
}
