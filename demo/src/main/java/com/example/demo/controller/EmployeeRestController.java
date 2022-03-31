package com.example.demo.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;




	@RestController
	@RequestMapping("/api")
	public class EmployeeRestController {
		
		// to call the rest api using swagger.
//http://localhost:8081/swagger-ui/index.html
		
		
		
		
		// expose "/employees" and return list of employees
		@GetMapping("/employees")
		public String  findAll() {
		return "Calling all the list of employees ";
		}

		// add mapping for GET /employees/{employeeId}
		
		@GetMapping("/employees/{employeeId}")
		public String  getEmployee(@PathVariable int employeeId) {
			
			return "giving details of pasrticular employee"+ employeeId;
		}
		
		// add mapping for POST /employees - add new employee
		
		@PostMapping("/employees")
		public String addEmployee(@RequestBody Employee theEmployee) {
			
		return "saved the given employee details";
		}
		
		// add mapping for PUT /employees - update existing employee
		
		@PutMapping("/employees")
		public String  updateEmployee(@RequestBody Employee theEmployee) {
			
			return "updating the employee with" + theEmployee.getId();
		}
		
		// add mapping for DELETE /employees/{employeeId} - delete employee
		
		@DeleteMapping("/employees/{employeeId}")
		public String deleteEmployee(@PathVariable int employeeId) {
			return "delete employee callled";
	}

}
