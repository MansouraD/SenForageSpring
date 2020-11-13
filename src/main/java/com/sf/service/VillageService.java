package com.sf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.entities.Village;
import com.sf.metier.VillageMetier;

@RestController
public class VillageService {
	@Autowired
	public VillageMetier VillageMetier;
	@PostMapping(value="/villages")
	public Village saveResponsable(@RequestBody Village v) {
		return VillageMetier.saveVillage(v);
	}
	
	@GetMapping(value="/villages")
	public List<Village> listVillage() {
		return VillageMetier.listVillage();
	}

}
