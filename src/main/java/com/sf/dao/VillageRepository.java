package com.sf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sf.entities.Village;

@Repository
public interface VillageRepository extends JpaRepository<Village, Integer> {

}
