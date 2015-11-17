package com.mindfiresolutions.springmaven.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mindfiresolutions.springmaven.models.Employee;

@Repository
	public interface AccountRepo extends JpaRepository<Employee, Integer>
	{
		public Employee findByEmployeeUserName(String employeeUserName);
		public Employee findByOfficialEmailID(String offEmaiID);
		public Employee save(Employee account);
	}


