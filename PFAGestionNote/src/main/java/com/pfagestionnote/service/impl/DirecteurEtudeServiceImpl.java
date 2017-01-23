package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.DirecteurEtudeDao;
import com.pfagestionnote.model.DirecteurEtude;
import com.pfagestionnote.service.DirecteurEtudeService;

@Service
public class DirecteurEtudeServiceImpl implements DirecteurEtudeService {
	@Autowired
	private DirecteurEtudeDao directeurEtudeDao;

	@Transactional
	public void add(DirecteurEtude directeurEtude) {
		directeurEtudeDao.add(directeurEtude);

	}

	@Transactional
	public void edit(DirecteurEtude directeurEtude) {
		directeurEtudeDao.edit(directeurEtude);

	}

	@Transactional
	public void delete(int directeurEtudeId) {
		directeurEtudeDao.delete(directeurEtudeId);

	}

	@Transactional
	public DirecteurEtude getDirecteurEtude(int directeurEtudeId) {
		return directeurEtudeDao.getDirecteurEtude(directeurEtudeId);
				
	}

	@Transactional
	public List getAllDirecteurEtude() {
		return directeurEtudeDao.getAllDirecteurEtude();
	}

	@Transactional
	public DirecteurEtude findUserByNumInsc(String numMatricule) {
		// TODO Auto-generated method stub
		return directeurEtudeDao.findUserByNumInsc(numMatricule);
	}

}
