package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.EnseignantDao;
import com.pfagestionnote.model.Enseignant;
import com.pfagestionnote.service.EnseignantService;

@Service
public class EnseignantServiceImpl implements EnseignantService {
	@Autowired
	private EnseignantDao enseignantDao;

	@Transactional
	public void add(Enseignant enseignant) {
		enseignantDao.add(enseignant);

	}

	@Transactional
	public void edit(Enseignant enseignant) {
		enseignantDao.edit(enseignant);

	}

	@Transactional
	public void delete(int enseignantId) {
		enseignantDao.delete(enseignantId);

	}

	@Transactional
	public Enseignant getEnseignant(int enseignantId) {
		return enseignantDao.getEnseignant(enseignantId);
	}

	@Transactional
	public List getAllEnseignant() {
		return enseignantDao.getAllEnseignant();
	}

	@Transactional
	public Enseignant findUserByNumInsc(String numMatricule) {
		// TODO Auto-generated method stub
		return enseignantDao.findUserByNumInsc(numMatricule);
	}

}
