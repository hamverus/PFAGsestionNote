package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.EtudiantHasMatiereIdDao;
import com.pfagestionnote.model.EtudiantHasMatiereId;
@Repository
public class EtudiantHasMatiereIdDaoImpl implements EtudiantHasMatiereIdDao {

	private SessionFactory session;
	
	@Override
	public void add(EtudiantHasMatiereId etudiantHasMatiereId) {
		session.getCurrentSession().save(etudiantHasMatiereId);

	}

	@Override
	public void edit(EtudiantHasMatiereId etudiantHasMatiereId) {
		session.getCurrentSession().update(etudiantHasMatiereId);

	}

	@Override
	public void delete(int etudiantHasMatiereId) {
		session.getCurrentSession().delete(getEtudiantHasMatiereId(etudiantHasMatiereId));
	}

	@Override
	public EtudiantHasMatiereId getEtudiantHasMatiereId(int etudiantHasMatiereId) {
		// TODO Auto-generated method stub
		return (EtudiantHasMatiereId)session.getCurrentSession().get(EtudiantHasMatiereId.class, etudiantHasMatiereId);
	}

	@Override
	public List getAllEtudiantHasMatiereId() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From EtdiantHasMatiereId").list();
	}

}
