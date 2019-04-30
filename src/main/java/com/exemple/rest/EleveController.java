package com.exemple.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.entities.Eleve;
import com.exemple.service.InterfaceService;

@RestController
public class EleveController {
	
	@Autowired
	private InterfaceService<Eleve> eleveService;
	
	@GetMapping("/api/get/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		return eleveService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Eleve save(@RequestBody Eleve p) {
		return eleveService.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Eleve p) {
		eleveService.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Eleve> getAll() {
		return eleveService.getAll();
	}


}
