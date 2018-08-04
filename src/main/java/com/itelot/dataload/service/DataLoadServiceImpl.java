package com.itelot.dataload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itelot.dataload.dao.DataLoadDao;
import com.itelot.dataload.entity.Employee;

@Service
public class DataLoadServiceImpl implements DataLoadService {

	@Autowired
	private DataLoadDao dataLoadDao;
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee employee = dataLoadDao.getEmployeeById(employeeId);
		return employee;
	}

}
