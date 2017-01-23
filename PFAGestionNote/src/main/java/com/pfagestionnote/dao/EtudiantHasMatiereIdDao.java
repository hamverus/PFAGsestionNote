package com.pfagestionnote.dao;

import java.util.List;



import com.pfagestionnote.model.EtudiantHasMatiereId;

public interface EtudiantHasMatiereIdDao {
	public void add(EtudiantHasMatiereId etudiantHasMatiereId);
	public void edit(EtudiantHasMatiereId etudiantHasMatiereId);
	public void delete(int etudiantHasMatiereId);
	public EtudiantHasMatiereId getEtudiantHasMatiereId(int etudiantHasMatiereId);
	public List getAllEtudiantHasMatiereId();

}
