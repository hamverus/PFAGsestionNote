package com.pfagestionnote.dao;

import java.util.List;

import com.pfagestionnote.model.DirecteurEtude;



public interface DirecteurEtudeDao {
	public void add(DirecteurEtude directeurEtude);
	public void edit(DirecteurEtude directeurEtude);
	public void delete(int directeurEtudeId);
	public DirecteurEtude getDirecteurEtude(int directeurEtudeId);
	public List getAllDirecteurEtude();
	public DirecteurEtude findUserByNumInsc(String numMatricule);
}
