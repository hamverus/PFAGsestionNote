package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.PlanEtudeDao;
import com.pfagestionnote.model.PlanEtude;
import com.pfagestionnote.service.PlanEtudeService;
@Service
public class PlanEtudeServiceImpl implements PlanEtudeService {
	@Autowired
	private PlanEtudeDao planEtudeDao;
	@Transactional
	public void add(PlanEtude planEtude) {
		planEtudeDao.add(planEtude);

	}

	

	@Transactional
	public void edit(PlanEtude planEtude) {
		planEtudeDao.edit(planEtude);

	}
	@Transactional
	public void delete(int planEtudeId) {
		planEtudeDao.delete(planEtudeId);
	}

	@Transactional
	public PlanEtude getPlanEtude(int planEtudeId) {
		
		return planEtudeDao.getPlanEtude(planEtudeId);
	}

	@Transactional
	public List getAllPlanEtude() {
		return planEtudeDao.getAllPlanEtude();
	}

}
