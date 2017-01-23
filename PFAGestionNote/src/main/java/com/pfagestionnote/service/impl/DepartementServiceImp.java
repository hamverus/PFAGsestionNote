package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.DepartementDao;
import com.pfagestionnote.model.Departement;
import com.pfagestionnote.service.DepartementService;

@Service
public class DepartementServiceImp implements DepartementService {
	@Autowired
	private DepartementDao departementDao;

	@Transactional
	public void add(Departement departement) {
		departementDao.add(departement);
	}

	@Transactional
	public void edit(Departement departement) {
		departementDao.edit(departement);

	}

	@Transactional
	public void delete(int departementId) {
		departementDao.delete(departementId);
	}

	@Transactional
	public Departement getDepartement(int departementId) {
		return departementDao.getDepartement(departementId);
	}

	@Transactional
	public List getAllDepartement() {
		return departementDao.getAllDepartement();
	}

}
