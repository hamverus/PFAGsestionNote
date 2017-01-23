package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.ModuleDao;
import com.pfagestionnote.model.Module;
import com.pfagestionnote.service.ModuleService;
@Service
public class ModuleServiceImpl implements ModuleService{
	@Autowired
	private ModuleDao moduleDao ;
	@Transactional
	public void add(Module module) {
		moduleDao.add(module);
	}

	

	@Transactional
	public void edit(Module module) {
		moduleDao.edit(module);
	}
	@Transactional
	public void delete(int moduleId) {
		moduleDao.delete(moduleId);

	}

	@Transactional
	public Module getModule(int moduleId) {
		
		return moduleDao.getModule(moduleId);
	}

	@Transactional
	public List getAllModule() {
		return moduleDao.getAllModule();
	}

	@Transactional
	public List getModuleBySection(int sectionId) {
		// TODO Auto-generated method stub
		return moduleDao.getModuleBySection(sectionId);
	}


}
