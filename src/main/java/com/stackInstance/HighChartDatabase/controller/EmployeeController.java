package com.stackInstance.HighChartDatabase.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.stackInstance.HighChartDatabase.service.IUserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	


	@Autowired
	private IUserServiceImp userServiceImp;

	@GetMapping("/barChart")
	public String getAllEmployee(Model model) {	
		
	List<String> username= userServiceImp.getAllUser().stream().map(x-> x.getName()).collect(Collectors.toList());
	List<Integer> numamigos = userServiceImp.getAllUser().stream().map(x-> x.getNumber_friends()).collect(Collectors.toList());
	model.addAttribute("name", username);
	model.addAttribute("number_friends", numamigos);
	return "barChart";
	
	}
}
