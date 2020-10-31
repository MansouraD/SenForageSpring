package com.sf.metier;

import com.sf.entities.Client;

import java.util.List;

public interface ClientMetier {
	
	public Client saveClient(Client c);
	
	public List<Client> listClient();

}
