package com.itelot.dataload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itelot.dataload.entity.Employee;
import com.itelot.dataload.service.DataLoadService;

@Controller
@RequestMapping("user")
public class DataLoadController {
	
	@Autowired
	private DataLoadService dataLoadService;
	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> getArticleById(@PathVariable("id") Integer id) {
		Employee article = dataLoadService.getEmployeeById(id);
		return new ResponseEntity<Employee>(article, HttpStatus.OK);
	}


}
