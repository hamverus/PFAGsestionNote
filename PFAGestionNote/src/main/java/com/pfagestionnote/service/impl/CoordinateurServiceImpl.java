package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.CoordinateurDao;
import com.pfagestionnote.model.Coordinateur;
import com.pfagestionnote.service.CoordinateurService;

@Service
public class CoordinateurServiceImpl implements CoordinateurService {
	@Autowired
	private CoordinateurDao coordinateurDao;

	@Transactional
	public void add(Coordinateur coordinateur) {
		coordinateurDao.add(coordinateur);
	}

	@Transactional
	public void edit(Coordinateur coordinateur) {
		coordinateurDao.edit(coordinateur);

	}

	@Transactional
	public void delete(int coordinateurId) {
		coordinateurDao.delete(coordinateurId);

	}

	
	@Transactional
	public Coordinateur getCoordinateur(int coordinateurId) {
		return coordinateurDao.getCoordinateur(coordinateurId);
	}

	@Transactional
	public List getAllCoordinateur() {
		return coordinateurDao.getAllCoordinateur();
	}

	@Transactional
	public Coordinateur findUserByNumInsc(String numMatricule) {
		// TODO Auto-generated method stub
		return coordinateurDao.findUserByNumInsc(numMatricule);
	}

}
