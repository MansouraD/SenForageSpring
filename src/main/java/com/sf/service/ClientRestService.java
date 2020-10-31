package com.sf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sf.entities.Client;
import com.sf.metier.ClientMetier;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier ClientMetier;
	@RequestMapping(value="/clients",method=RequestMethod.POST)
	public Client saveClient(@RequestBody Client c) {
		return ClientMetier.saveClient(c);
	}
	
	@RequestMapping(value="/clients",method=RequestMethod.GET)
	public List<Client> listClient() {
		return ClientMetier.listClient();
	}

}
 