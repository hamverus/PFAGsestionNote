package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.GroupeDao;
import com.pfagestionnote.model.Groupe;
import com.pfagestionnote.service.GroupeService;

@Service
public class GroupeServiceImpl implements GroupeService{
	@Autowired
	private GroupeDao groupeDao;
	@Transactional
	public void add(Groupe groupe) {
		groupeDao.add(groupe);
	}

	

	@Transactional
	public void edit(Groupe groupe) {
		groupeDao.edit(groupe);

	}
	@Transactional
	public void delete(int groupeId) {
		groupeDao.delete(groupeId);

	}

	@Transactional
	public Groupe getGroupe(int groupeId) {
		
		return groupeDao.getGroupe(groupeId);
	}

	@Transactional
	public List getAllGroupe() {
		return groupeDao.getAllGroupe();
	}

}
