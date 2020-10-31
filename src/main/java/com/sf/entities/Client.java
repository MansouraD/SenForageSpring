package com.sf.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity 
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;


	public Client() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nom_famille;
	@Column
	private String adresse;
	@Column
	private String numero_tel;
	@ManyToOne
	@JoinColumn(name="code_village")
	private Village village;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom_famille() {
		return nom_famille;
	}
	public void setNom_famille(String nom_famille) {
		this.nom_famille = nom_famille;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumero_tel() {
		return numero_tel;
	}
	public void setNumero_tel(String numero_tel) {
		this.numero_tel = numero_tel;
	}
	
}

