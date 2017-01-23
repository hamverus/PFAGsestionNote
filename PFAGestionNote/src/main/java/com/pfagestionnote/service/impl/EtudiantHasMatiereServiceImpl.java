package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.EtudiantHasMatiereDao;
import com.pfagestionnote.model.EtudiantHasMatiere;
import com.pfagestionnote.service.EtudiantHasMatiereService;

@Service
public class EtudiantHasMatiereServiceImpl implements EtudiantHasMatiereService {
	@Autowired
	private EtudiantHasMatiereDao etudiantHasMatiereDao;

	@Transactional
	public void add(EtudiantHasMatiere etudiantHasMatiere) {
		etudiantHasMatiereDao.add(etudiantHasMatiere);
	}

	@Transactional
	public void edit(EtudiantHasMatiere etudiantHasMatiere) {
		etudiantHasMatiereDao.edit(etudiantHasMatiere);

	}

	@Transactional
	public void delete(int etudiantHasMatiereId) {
		etudiantHasMatiereDao.delete(etudiantHasMatiereId);
	}

	@Transactional
	public EtudiantHasMatiere getEtudiantHasMatiere(int etudiantHasMatiereId) {
		return etudiantHasMatiereDao.getEtudiantHasMatiere(etudiantHasMatiereId);
	}

	@Transactional
	public List getAllEtudiantHasMatiere() {
		return etudiantHasMatiereDao.getAllEtudiantHasMatiere();
	}

}
