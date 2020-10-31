package com.sf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sf.entities.Responsable;
import com.sf.metier.ResponsableMetier;

@RestController 
public class ResponsableService {

	@Autowired
	public ResponsableMetier ResponsableMetier;
	@RequestMapping(value="/responsables",method=RequestMethod.POST)
	public Responsable saveResponsable(@RequestBody Responsable r) {
		return ResponsableMetier.saveResponsable(r);
	}
	
	@RequestMapping(value="/responsables",method=RequestMethod.GET)
	public List<Responsable> listResponsable() {
		return ResponsableMetier.listResponsable();
	}
}
