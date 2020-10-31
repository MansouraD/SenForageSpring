package com.sf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sf.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
