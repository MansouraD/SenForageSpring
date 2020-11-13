package com.sf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.entities.Client;
import com.sf.metier.ClientMetier;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier ClientMetier;
	@PostMapping(value="/clients")
	public Client saveClient(@RequestBody Client c) {
		
	
		return ClientMetier.saveClient(c);
	}
	
	@GetMapping(value="/clients")
	public List<Client> listClient() {
		return ClientMetier.listClient();
	}

}
 