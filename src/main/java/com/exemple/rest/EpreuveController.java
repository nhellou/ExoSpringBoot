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
import com.exemple.service.InterfaceService;

@RestController
public class EpreuveController {
	
	@Autowired
	private InterfaceService<Epreuve> epreuveService;
	
	@GetMapping("/api/get/{id}")
	public Epreuve findOneById(@PathVariable Long id) {
		return epreuveService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Epreuve save(@RequestBody Epreuve p) {
		return epreuveService.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Epreuve p) {
		epreuveService.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Epreuve> getAll() {
		return epreuveService.getAll();
	}


}
