package com.code.Anuja.restapi.Service;

import java.util.ArrayList;
import java.util.List;

import com.code.Anuja.restapi.model.Employee;

public class Employeeserviceimpl implements EmployeeService{
	private static List<Employee> list =new ArrayList<Employee>();
	
	static{
		Employee e= new Employee();
		e.setId(1);
		e.setName("Anuja");
		e.setDepartment("cse");
		e.setEmail("anujakulkarni@gmail.com");
		
		list.add(e);
	}
	@Override
	public List<Employee> geteList() {
		
	
		return list;
	}
	

}
