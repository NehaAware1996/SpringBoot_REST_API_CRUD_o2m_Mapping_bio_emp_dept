package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Department;
import com.rest.repository.DepartmentRepository;
import com.rest.repository.EmployeeRepository;

@Service
public class DepartemntServiceimpl implements DepartmentServicei
{
	@Autowired
	DepartmentRepository dsr;
	
	@Autowired
	EmployeeRepository emr;

	@Override
	public Department save(Department dp) 
	{
		Department save = dsr.save(dp);
		return save;
	}
}
