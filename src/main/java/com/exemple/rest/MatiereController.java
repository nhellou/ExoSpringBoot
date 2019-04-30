package com.exemple.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.entities.Laboratoire;
import com.exemple.entities.Matiere;
import com.exemple.service.InterfaceService;

@RestController
public class MatiereController {

	@Autowired
	private InterfaceService<Matiere> matiereService;
	
	@GetMapping("/api/get/{id}")
	public Matiere findOneById(@PathVariable Long id) {
		return matiereService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Matiere save(@RequestBody Matiere p) {
		return matiereService.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Matiere p) {
		matiereService.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Matiere> getAll() {
		return matiereService.getAll();
	}
	
}
