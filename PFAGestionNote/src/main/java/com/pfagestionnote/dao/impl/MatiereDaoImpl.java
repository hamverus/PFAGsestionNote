package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.MatiereDao;
import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.model.Module;
import com.pfagestionnote.service.EnseignantService;
import com.pfagestionnote.service.ModuleService;

public class MatiereDaoImpl implements MatiereDao{
	@Autowired
	private SessionFactory session;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private EnseignantService EnseignantService;
	protected HibernateTemplate template = null;
	public void setSessionFactory(SessionFactory sessionFactory) {
        template = new HibernateTemplate(sessionFactory);
    }
	@Override
	public void add(Matiere matiere) {
		session.getCurrentSession().save(matiere);
	}

	

	@Override
	public void edit(Matiere matiere) {
		session.getCurrentSession().update(matiere);

	}
	@Override
	public void delete(int matiereId) {
		session.getCurrentSession().delete(getMatiere(matiereId));

	}
	@Override
	public Matiere getMatiere(int matiereId) {
		
		return (Matiere)session.getCurrentSession().get(Matiere.class, matiereId);
	}

	@Override
	public List getAllMatiere() {
		return session.getCurrentSession().createQuery("From Matiere").list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List getMatiereByModule(int moduleId) {
			Criteria criteria = session.getCurrentSession().createCriteria(Matiere.class);
			criteria.add(Restrictions.eq("section", this.moduleService.getModule(moduleId)));	
			return criteria.list();
	}



	@Override
	public List getMatiereByEnseignant(int enseignantId) {
		
		Criteria criteria = session.getCurrentSession().createCriteria(Matiere.class);
		criteria.add(Restrictions.eq("enseignant", this.EnseignantService.getEnseignant(enseignantId)));		
		return  criteria.list();
	}


}
