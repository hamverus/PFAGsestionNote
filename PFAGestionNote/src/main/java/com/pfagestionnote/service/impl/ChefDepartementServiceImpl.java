package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.ChefDepartementDao;
import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.service.ChefDepartementService;

@Service
public class ChefDepartementServiceImpl implements ChefDepartementService {
	
	@Autowired
	private ChefDepartementDao chefDepartementDao;

	@Transactional
	public void add(ChefDepartement chefDepartement) {
		chefDepartementDao.add(chefDepartement);

	}

	@Transactional
	public void edit(ChefDepartement chefDepartement) {
		chefDepartementDao.edit(chefDepartement);
	}

	@Transactional
	public void delete(int chefDepartementeId) {
		chefDepartementDao.delete(chefDepartementeId);

	}

	@Transactional
	public ChefDepartement getChefDepartement(int chefDepartementId) {
		
		return chefDepartementDao.getChefDepartement(chefDepartementId);
	}

	@Transactional
	public List getAllChefDepartement() {
		return chefDepartementDao.getAllChefDepartement();
	}

	@Transactional
	public ChefDepartement findUserByNumInsc(String numMatricule) {
		
		return chefDepartementDao.findUserByNumInsc(numMatricule); }

}
