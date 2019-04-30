package com.exemple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dao.InterfaceCrud;
import com.exemple.entities.Matiere;

@Service
public class MatiereService implements InterfaceService<Matiere>{
	
	@Autowired
	private InterfaceCrud<Matiere> matDao;

	@Override
	public Matiere findOneById(Long id) {

		return matDao.getOne(id);
	}

	@Override
	public Matiere save(Matiere p) {
		
		return matDao.save(p);
	}

	@Override
	public void delete(Matiere p) {
		matDao.delete(p);		
	}

	@Override
	public List<Matiere> getAll() {
	
		return null;
	}

}
