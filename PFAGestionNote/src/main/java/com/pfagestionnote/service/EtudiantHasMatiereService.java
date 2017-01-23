package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.EtudiantHasMatiere;



public interface EtudiantHasMatiereService {
	public void add(EtudiantHasMatiere etudiantHasMatiere);
	public void edit(EtudiantHasMatiere etudiantHasMatiere);
	public void delete(int etudiantHasMatiereId);
	public EtudiantHasMatiere getEtudiantHasMatiere(int etudiantHasMatiereId);
	public List getAllEtudiantHasMatiere();
}
