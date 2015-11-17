package com.mindfiresolutions.springmaven.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.mindfiresolutions.springmaven.models.Client;
import com.mindfiresolutions.springmaven.models.Employee;
import com.mindfiresolutions.springmaven.models.EmployeeRole;
import com.mindfiresolutions.springmaven.models.Project;
import com.mindfiresolutions.springmaven.models.ProjectMemberDetail;

@Component
public interface AccoutService {
	
	public Employee findAccountByUsername(String username);
	public Employee findAccountByAccountId(Long accountId);
	public Employee findByOfficialEmailID(String offEmaiID);
	public Employee saveEmployee(Employee account);
	public EmployeeRole saveRole(EmployeeRole role);
	public ArrayList<ProjectMemberDetail> findByLeadId(Long leadId);
	public ArrayList<Project> findAllProjects();
	public ArrayList<ProjectMemberDetail> findByAccountId(Long empId);
	public ArrayList<ProjectMemberDetail> findByProjectId(Long projectId);
	public ArrayList<Client> findAllClients();
	public ArrayList<Employee> findByExclude(Long projectId,Long leadId);

}
