package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.pojo.Employee;
                                                  //POJO,Id - type
public interface EmployeeRepo extends JpaRepository<Employee,Integer > {

	String sql="select employee.phono from Employee employee where employee.empname=?1 and employee.empid=?2";
	@Query(sql)
	public String findPhono(String name,int id);

}
