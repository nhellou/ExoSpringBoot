package com.exemple.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.entities.Epreuve;
import com.exemple.entities.Laboratoire;
import com.exemple.service.InterfaceService;

@RestController
public class LaboratoireController {
	
	@Autowired
	private InterfaceService<Laboratoire> labService;
	
	@GetMapping("/api/get/{id}")
	public Laboratoire findOneById(@PathVariable Long id) {
		return labService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Laboratoire save(@RequestBody Laboratoire p) {
		return labService.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Laboratoire p) {
		labService.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Laboratoire> getAll() {
		return labService.getAll();
	}


}
