package com.example.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Employee;
import com.example.repo.EmployeeRepo;

@Service
public class EmployeeService {

	//creates an obj automatically wrt to the dummy object which u have created 
	@Autowired
	EmployeeRepo repo;
	
	//insert
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	//getallrecord
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	//insert all
		public List<Employee> insertall(List<Employee> e) {
			return repo.saveAll(e);
		}
		
		//getbyid
		//getbyid--primary key -int
			public Optional<Employee> getByid(int id) {
				return repo.findById(id);
			}
			
//			public Employee getByid(int id) {
//				return repo.findById(id).orElse(null);
//			}

			
			//deleteAll-deleting all records 
			public void deletebyid(int id) {
				repo.deleteById(id);
			}
			
			//update                  {id:5,name:"updated name"}
			public Employee updatebyname(Employee e) {
				Employee ee=repo.findById(e.getEmpid()).orElse(null);
				ee.setEmpname(e.getEmpname());
				return repo.save(ee);
			}
			
			//updatePhoneNumber
			public Employee updatebyphono(Employee e) {
				Employee ee=repo.findById(e.getEmpid()).orElse(null);
				ee.setPhono(e.getPhono());
				return repo.save(ee);
			}
			
			//predefined method 
			public String findphono(String name,int id) {
				return repo.findPhono(name, id);
			}



		

}

