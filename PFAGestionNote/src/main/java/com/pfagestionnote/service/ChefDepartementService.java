package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.ChefDepartement;


public interface ChefDepartementService {
	public void add(ChefDepartement chefDepartement);
	public void edit(ChefDepartement chefDepartement);
	public void delete(int chefDepartementeId);
	public ChefDepartement getChefDepartement(int chefDepartementId);
	public List getAllChefDepartement();
	public ChefDepartement findUserByNumInsc(String numMatricule);

}
