package com.sf.metier;

import java.util.List;

import com.sf.entities.Village;

public interface VillageMetier {
public Village saveVillage(Village v);
	
	public List<Village> listVillage();

}
