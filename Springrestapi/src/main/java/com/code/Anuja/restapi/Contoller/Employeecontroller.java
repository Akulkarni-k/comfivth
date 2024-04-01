package com.code.Anuja.restapi.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code.Anuja.restapi.Service.EmployeeService;
import com.code.Anuja.restapi.model.Employee;

//@Controller
@RestController
public class Employeecontroller {
	//data feath from clint to server
	//localhost:8080/employees
	
	@Autowired
	private EmployeeService eservice;
	//list of employee data
	
	@GetMapping("/employees")
	public List<Employee> getlistemployees()
	{
		return eservice.geteList();
		
	}
	@GetMapping("/employees")
	public String getemployees()
	{
		return "display list employees";
		
	}
	
//localhost:8080/employee/12
	@GetMapping("/employee/{id}")
	public String getemployee(@PathVariable("id") Long id)
	{
		return "featching the employee for id "+id;
		
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee emp)
	{
		return "save the employee value in to database"+emp;
		
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee emp)
	{
		System.out.println("updating employee data from uri");
		return emp;
		
	}
}
