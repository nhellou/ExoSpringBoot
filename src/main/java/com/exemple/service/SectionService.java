package com.exemple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dao.InterfaceCrud;
import com.exemple.entities.Section;

@Service
public class SectionService implements InterfaceService<Section>{
	
	
	@Autowired
	private InterfaceCrud<Section> sectionDao;

	@Override
	public Section findOneById(Long id) {
		return sectionDao.getOne(id);
	}

	@Override
	public Section save(Section p) {
		return sectionDao.save(p);
	}

	@Override
	public void delete(Section p) {
		sectionDao.delete(p);
	}

	@Override
	public List<Section> getAll() {
		return sectionDao.findAll();
	}

}
