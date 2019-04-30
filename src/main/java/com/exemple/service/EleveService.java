package com.exemple.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dao.InterfaceCrud;
import com.exemple.entities.Eleve;

@Service
public class EleveService implements InterfaceService<Eleve>{
	
	@Autowired
	private InterfaceCrud<Eleve> eleveDao;

	@Override
	public Eleve findOneById(Long id) {
		
		return eleveDao.getOne(id);
	}

	@Override
	public Eleve save(Eleve p) {
		
		return eleveDao.save(p);
	}

	@Override
	public void delete(Eleve p) {
		eleveDao.delete(p);
		
	}

	@Override
	public List<Eleve> getAll() {
		
		return eleveDao.findAll();
	}

	
}
