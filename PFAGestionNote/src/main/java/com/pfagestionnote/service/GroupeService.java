package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.Groupe;



public interface GroupeService {
	public void add(Groupe groupe);
	public void edit(Groupe groupe);
	public void delete(int groupeId);
	public Groupe getGroupe(int groupeId);
	public List getAllGroupe();

}
