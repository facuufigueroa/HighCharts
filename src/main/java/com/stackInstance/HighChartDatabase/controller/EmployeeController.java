package com.stackInstance.HighChartDatabase.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.stackInstance.HighChartDatabase.model.User;
import com.stackInstance.HighChartDatabase.service.IUserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stackInstance.HighChartDatabase.model.Employee;
import com.stackInstance.HighChartDatabase.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@Autowired
	private IUserServiceImp userServiceImp;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
	}

	
	@GetMapping("/barChart")
	public String getAllEmployee(Model model) {	
		
	List<String> username= userServiceImp.getAllUser().stream().map(x-> x.getName()).collect(Collectors.toList());
	List<Integer> numamigos = userServiceImp.getAllUser().stream().map(x-> x.getNumber_friends()).collect(Collectors.toList());
	model.addAttribute("name", username);
	model.addAttribute("age", numamigos);
	return "barChart";
	
	}
}
