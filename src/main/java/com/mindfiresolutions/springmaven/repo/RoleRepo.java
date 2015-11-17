package com.mindfiresolutions.springmaven.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfiresolutions.springmaven.models.EmployeeRole;

@Repository
public interface RoleRepo extends JpaRepository<EmployeeRole, Integer>{
	public EmployeeRole save(EmployeeRole role);
}
