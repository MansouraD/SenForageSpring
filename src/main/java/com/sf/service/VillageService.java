package com.sf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sf.entities.Village;
import com.sf.metier.VillageMetier;

@RestController
public class VillageService {
	@Autowired
	public VillageMetier VillageMetier;
	@RequestMapping(value="/villages",method=RequestMethod.POST)
	public Village saveResponsable(@RequestBody Village v) {
		return VillageMetier.saveVillage(v);
	}
	
	@RequestMapping(value="/villages",method=RequestMethod.GET)
	public List<Village> listVillage() {
		return VillageMetier.listVillage();
	}

}
