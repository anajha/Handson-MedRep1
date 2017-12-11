package com.handson.medrep.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/*This is the service repository interface containing methods to ease the CRUD operations
using Hibernate*/
@Repository
@Transactional
public interface MedrepRepository extends JpaRepository<MedrepModel, String>{
	
	
	public MedrepModel findByrepresentativeEmployeeId(String representativeEmployeeId);

	public List<MedrepModel> findAll();
}