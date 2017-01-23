package com.pfagestionnote.dao;

import java.util.List;

import com.pfagestionnote.model.Departement;



public interface DepartementDao {
	public void add(Departement departement);
	public void edit(Departement departement);
	public void delete(int departementId);
	public Departement getDepartement(int departementId);
	public List getAllDepartement();


}
