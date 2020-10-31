package com.sf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.entities.Village;
import com.sf.dao.VillageRepository;

@Service
public class VillageMetierImp implements VillageMetier {
	
	@Autowired
	private VillageRepository VillageRepository;

	//@Override
	public Village saveVillage(Village v) {
		
		return null;
	}
	
	//@Override
	public List<Village> listVillage() {
		
		return null;
	}

}
