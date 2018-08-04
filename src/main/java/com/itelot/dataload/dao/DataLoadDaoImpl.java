package com.itelot.dataload.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.itelot.dataload.entity.Employee;

@Transactional
@Repository
public class DataLoadDaoImpl implements DataLoadDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee getEmployeeById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

}
