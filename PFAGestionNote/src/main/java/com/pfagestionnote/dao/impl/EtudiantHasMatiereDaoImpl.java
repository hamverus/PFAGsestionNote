package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.EtudiantHasMatiereDao;
import com.pfagestionnote.model.EtudiantHasMatiere;
@Repository
public class EtudiantHasMatiereDaoImpl implements EtudiantHasMatiereDao {
	
	private SessionFactory session;

	@Override
	public void add(EtudiantHasMatiere etudiantHasMatiere) {
		session.getCurrentSession().save(etudiantHasMatiere);
	}

	@Override
	public void edit(EtudiantHasMatiere etudiantHasMatiere) {
		session.getCurrentSession().update(etudiantHasMatiere);

	}

	@Override
	public void delete(int etudiantHasMatiereId) {
		session.getCurrentSession().delete(getEtudiantHasMatiere(etudiantHasMatiereId));
	}

	@Override
	public EtudiantHasMatiere getEtudiantHasMatiere(int etudiantHasMatiereId) {
		// TODO Auto-generated method stub
		return (EtudiantHasMatiere)session.getCurrentSession().get(EtudiantHasMatiere.class, etudiantHasMatiereId);
	}

	@Override
	public List getAllEtudiantHasMatiere() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From EtudiantHasMatiere").list();
	}

}
