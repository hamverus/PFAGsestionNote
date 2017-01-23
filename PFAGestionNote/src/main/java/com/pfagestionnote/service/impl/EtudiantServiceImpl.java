package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.EtudiantDao;
import com.pfagestionnote.model.Etudiant;
import com.pfagestionnote.service.EtudiantService;

@Service
public class EtudiantServiceImpl implements EtudiantService {
	
	@Autowired
	private EtudiantDao etudiantDao;

	@Transactional
	public void add(Etudiant etudiant) {
		etudiantDao.add(etudiant);

	}

	@Transactional
	public void edit(Etudiant etudiant) {
		etudiantDao.edit(etudiant);

	}

	@Transactional
	public void delete(int etudiantId) {
		etudiantDao.delete(etudiantId);

	}

	@Transactional
	public Etudiant getEtudiant(int etudiantId) {
		return etudiantDao.getEtudiant(etudiantId);
	}

	@Transactional
	public List getAllEtudiant() {
		return etudiantDao.getAllEtudiant();
	}

	@Transactional
	public Etudiant findUserByNumInsc(String numInsc) {
		// TODO Auto-generated method stub
		return etudiantDao.findUserByNumInsc(numInsc);
	}

}
