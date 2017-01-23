package com.pfagestionnote.service;

import java.util.List;



import com.pfagestionnote.model.EtudiantHasMatiereId;

public interface EtudiantHasMatiereIdService {
	public void add(EtudiantHasMatiereId etudiantHasMatiereId);
	public void edit(EtudiantHasMatiereId etudiantHasMatiereId);
	public void delete(int etudiantHasMatiereId);
	public EtudiantHasMatiereId getEtudiantHasMatiereId(int etudiantHasMatiereId);
	public List getAllEtudiantHasMatiereId();

}
