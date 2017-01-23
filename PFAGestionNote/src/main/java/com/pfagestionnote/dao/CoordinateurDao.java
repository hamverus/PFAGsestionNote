package com.pfagestionnote.dao;

import java.util.List;



import com.pfagestionnote.model.Coordinateur;



public interface CoordinateurDao {
	public void add(Coordinateur coordinateur);
	public void edit(Coordinateur coordinateur);
	public void delete(int coordinateurId);
	public Coordinateur getCoordinateur(int coordinateurId);
	public List getAllCoordinateur();
	public Coordinateur findUserByNumInsc(String numMatricule);
}
