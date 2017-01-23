package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.MatiereDao;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.service.MatiereService;
@Service
public class MatiereServiceImpl implements MatiereService{
	@Autowired
	private MatiereDao matiereDao;
	@Transactional
	public void add(Matiere matiere) {
		matiereDao.add(matiere);;
	}

	

	@Transactional
	public void edit(Matiere matiere) {
		matiereDao.edit(matiere);

	}
	@Transactional
	public void delete(int matiereId) {
		matiereDao.delete(matiereId);

	}

	@Transactional
	public Matiere getMatiere(int matiereId) {
		
		return matiereDao.getMatiere(matiereId);
	}

	@Transactional
	public List getAllMatiere() {
		return matiereDao.getAllMatiere();
	}

	@Transactional
	public List getMatiereByModule(int moduleId) {
		// TODO Auto-generated method stub
		return matiereDao.getMatiereByModule(moduleId);
	}



	@Transactional
	public List getMatiereByEnseignant(int enseignantId) {
		
		return matiereDao.getMatiereByEnseignant(enseignantId);
	}


}
