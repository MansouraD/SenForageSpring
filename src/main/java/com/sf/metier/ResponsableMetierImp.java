package com.sf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.entities.Responsable;
import com.sf.dao.ResponsableRepository;

@Service
public class ResponsableMetierImp implements ResponsableMetier {
	@Autowired
	private ResponsableRepository ResponsableRepository;
	//@Override
	public Responsable saveResponsable(Responsable r) {
		
		return ResponsableRepository.save(r);
	}
	//@Override
	public List listResponsable() {
	
		return ResponsableRepository.findAll();
	}

}
