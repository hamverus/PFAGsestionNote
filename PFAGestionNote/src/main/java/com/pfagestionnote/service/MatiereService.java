package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.Matiere;


public interface MatiereService {
	public void add(Matiere matiere);
	public void edit(Matiere matiere);
	public void delete(int matiereId);
	public Matiere getMatiere(int matiereId);
	public List getAllMatiere();
	public List getMatiereByModule(int moduleId);
	public List getMatiereByEnseignant(int enseignantId);
}
