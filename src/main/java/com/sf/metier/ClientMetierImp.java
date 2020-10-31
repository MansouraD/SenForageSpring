package com.sf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.ClientRepository;
import com.sf.entities.Client;

@Service
public class ClientMetierImp implements ClientMetier {
	
	@Autowired
	private ClientRepository ClientRepository;
	
	//@Override
	public Client saveClient(Client c) {
	
		return ClientRepository.save(c);
	}
	
	//@Override
	public List listClient() {
	
		return ClientRepository.findAll();
	}

}
