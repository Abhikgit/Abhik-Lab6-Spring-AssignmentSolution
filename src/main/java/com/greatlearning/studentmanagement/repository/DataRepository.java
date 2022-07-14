package com.greatlearning.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentmanagement.entity.Data;



public interface DataRepository extends JpaRepository<Data,Integer> {
		
	
}
