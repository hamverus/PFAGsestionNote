package com.pfagestionnote.dao;

import java.util.List;

import com.pfagestionnote.model.ChefDepartement;


public interface ChefDepartementDao {
	public void add(ChefDepartement chefDepartement);
	public void edit(ChefDepartement chefDepartement);
	public void delete(int chefDepartementeId);
	public ChefDepartement getChefDepartement(int chefDepartementId);
	public List getAllChefDepartement();
	public ChefDepartement findUserByNumInsc(String numMatricule);
}
