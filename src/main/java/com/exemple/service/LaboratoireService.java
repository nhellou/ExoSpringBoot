package com.exemple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dao.InterfaceCrud;
import com.exemple.entities.Laboratoire;

@Service
public class LaboratoireService implements InterfaceService<Laboratoire>{
	
	@Autowired
	private InterfaceCrud<Laboratoire> labDao;

	@Override
	public Laboratoire findOneById(Long id) {
		
		return labDao.getOne(id);
	}

	@Override
	public Laboratoire save(Laboratoire p) {
		return labDao.save(p);
	}

	@Override
	public void delete(Laboratoire p) {
		labDao.delete(p);
	}

	@Override
	public List<Laboratoire> getAll() {
		return labDao.findAll();
	}

}
