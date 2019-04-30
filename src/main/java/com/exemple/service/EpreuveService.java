package com.exemple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dao.InterfaceCrud;
import com.exemple.entities.Epreuve;

@Service
public class EpreuveService implements InterfaceService<Epreuve>{
	
	@Autowired
	private InterfaceCrud<Epreuve> epreuveDao;

	@Override
	public Epreuve findOneById(Long id) {
		
		return epreuveDao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve p) {
		
		return epreuveDao.save(p);
	}

	@Override
	public void delete(Epreuve p) {
		epreuveDao.delete(p);
	}

	@Override
	public List<Epreuve> getAll() {
		
		return epreuveDao.findAll();
	}

}
