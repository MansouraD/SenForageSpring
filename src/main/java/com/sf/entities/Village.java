package com.sf.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Village implements Serializable {
	private static final long serialVersionUID = 1L;


	public Village() {
		super();
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nom_village;	
	@OneToMany(mappedBy="village")
	private Collection<Client> clients;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom_village;
	}
	public void setNom(String nom_village) {
		this.nom_village = nom_village;
	}
	
}
