package com.greatlearning.studentmanagement.service;

	import java.util.List;

	//import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.greatlearning.studentmanagement.entity.Data;
	import com.greatlearning.studentmanagement.repository.DataRepository;

	@Repository
	public class StudentServiceImpl 
		implements StudentService{

		@Autowired
		private DataRepository studentRepository;
		
		@Override
		public List<Data> findAll() {
			
			return studentRepository.findAll();
		}
		
		
		public void save(Data theStudent) {

			studentRepository.save(theStudent);

		}


		public Data findById(int id) {

			return studentRepository.findById(id).get();
		}


		@Override
		public void deleteById(int theId) {
			
			studentRepository.deleteById(theId);
			
		}
		

	}	