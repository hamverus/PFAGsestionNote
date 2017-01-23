package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.ModuleDao;
import com.pfagestionnote.model.Module;
import com.pfagestionnote.service.SectionService;
@Repository
public class ModuleDaoImpl implements ModuleDao{
	@Autowired
	private SessionFactory session;
	@Autowired
	private SectionService sectionService;
	@Override
	public void add(Module module) {
		session.getCurrentSession().save(module);
	}

	

	@Override
	public void edit(Module module) {
		session.getCurrentSession().update(module);

	}
	@Override
	public void delete(int moduleId) {
		session.getCurrentSession().delete(getModule(moduleId));

	}

	@Override
	public Module getModule(int moduleId) {
		
		return (Module)session.getCurrentSession().get(Module.class, moduleId);
	}

	@Override
	public List getAllModule() {
		return session.getCurrentSession().createQuery("From Module").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Module> getModuleBySection(int sectionId) {
		Criteria criteria = session.getCurrentSession().createCriteria(Module.class);
		criteria.add(Restrictions.eq("section", this.sectionService.getSection(sectionId)));	
		return criteria.list();
	}


}
