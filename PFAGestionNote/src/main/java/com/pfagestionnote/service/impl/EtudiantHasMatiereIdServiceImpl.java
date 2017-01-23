package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.EtudiantHasMatiereIdDao;
import com.pfagestionnote.model.EtudiantHasMatiereId;
import com.pfagestionnote.service.EtudiantHasMatiereIdService;

@Service
public class EtudiantHasMatiereIdServiceImpl implements EtudiantHasMatiereIdService {
	
	@Autowired
	private EtudiantHasMatiereIdDao etudiantHasMatiereIdDao;
	
	@Transactional
	public void add(EtudiantHasMatiereId etudiantHasMatiereId) {
		etudiantHasMatiereIdDao.add(etudiantHasMatiereId);

	}

	@Transactional
	public void edit(EtudiantHasMatiereId etudiantHasMatiereId) {
		etudiantHasMatiereIdDao.edit(etudiantHasMatiereId);

	}

	@Transactional
	public void delete(int etudiantHasMatiereId) {
		etudiantHasMatiereIdDao.delete(etudiantHasMatiereId);
	}

	@Transactional
	public EtudiantHasMatiereId getEtudiantHasMatiereId(int etudiantHasMatiereId) {
		return etudiantHasMatiereIdDao.getEtudiantHasMatiereId(etudiantHasMatiereId);
	}

	@Transactional
	public List getAllEtudiantHasMatiereId() {
		return etudiantHasMatiereIdDao.getAllEtudiantHasMatiereId();
	}

}
