package com.greatlearning.studentmanagement.service;
import java.util.List;

import com.greatlearning.studentmanagement.entity.Data;

public interface StudentService {


List<Data> findAll();
	
	void save(Data thestudent);
	
	Data findById(int theId);
	
	void deleteById(int theId);
	
}
