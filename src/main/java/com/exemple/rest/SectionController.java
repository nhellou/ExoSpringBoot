package com.exemple.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.entities.Matiere;
import com.exemple.entities.Section;
import com.exemple.service.InterfaceService;

@RestController
public class SectionController {

	@Autowired
	private InterfaceService<Section> sectionService;
	
	@GetMapping("/api/get/{id}")
	public Section findOneById(@PathVariable Long id) {
		return sectionService.findOneById(id);
	}

	@PostMapping("/api/save")
	public Section save(@RequestBody Section p) {
		return sectionService.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Section p) {
		sectionService.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Section> getAll() {
		return sectionService.getAll();
	}
}
