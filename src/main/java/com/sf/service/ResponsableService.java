package com.sf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.entities.Responsable;
import com.sf.metier.ResponsableMetier;

@RestController 
public class ResponsableService {

	@Autowired
	public ResponsableMetier ResponsableMetier;
	@PostMapping(value="/responsables")
	public Responsable saveResponsable(@RequestBody Responsable r) {
		return ResponsableMetier.saveResponsable(r);
	}
	
	@GetMapping(value="/responsables")
	public List<Responsable> listResponsable() {
		return ResponsableMetier.listResponsable();
	}
}
