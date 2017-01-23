package com.pfagestionnote.dao;

import java.util.List;

import com.pfagestionnote.model.EtudiantHasMatiere;



public interface EtudiantHasMatiereDao {
	public void add(EtudiantHasMatiere etudiantHasMatiere);
	public void edit(EtudiantHasMatiere etudiantHasMatiere);
	public void delete(int etudiantHasMatiereId);
	public EtudiantHasMatiere getEtudiantHasMatiere(int etudiantHasMatiereId);
	public List getAllEtudiantHasMatiere();
}
