package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.PlanEtude;


public interface PlanEtudeService {

	public void add(PlanEtude planEtude);
	
	public void edit(PlanEtude planEtude);
	public void delete(int planEtude);
	public PlanEtude getPlanEtude(int planEtudeId);
	public List getAllPlanEtude();

}
