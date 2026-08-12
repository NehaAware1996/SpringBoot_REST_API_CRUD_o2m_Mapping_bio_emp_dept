package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Department;
import com.rest.service.DepartmentServicei;

@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentServicei ds;
	
	
	@PostMapping("/save")
	public Department save(@RequestBody Department dp)
	{
		Department save = ds.save(dp);
		return save;
	}
}
