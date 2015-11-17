package com.mindfiresolutions.springmaven.service.impl;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfiresolutions.springmaven.models.Client;
import com.mindfiresolutions.springmaven.models.Employee;
import com.mindfiresolutions.springmaven.models.EmployeeRole;
import com.mindfiresolutions.springmaven.models.Project;
import com.mindfiresolutions.springmaven.models.ProjectMemberDetail;
import com.mindfiresolutions.springmaven.repo.AccountRepo;
import com.mindfiresolutions.springmaven.repo.ProjectMemberDetailsRepo;
import com.mindfiresolutions.springmaven.repo.RoleRepo;
import com.mindfiresolutions.springmaven.service.AccoutService;

@Service

public class AcccountServiceImpl implements  AccoutService {
	
	private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Autowired
	private ProjectMemberDetailsRepo detaisRepo;
	
	@Override
	public Employee findAccountByUsername(String username) {
		System.out.println(username);
		Employee account= accountRepo.findByEmployeeUserName(username);
		System.out.println(account);
		return account;	
	}

	
	@Override
	public Employee findAccountByAccountId(Long accountId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee findByOfficialEmailID(String offEmaiID) {
		Employee account= accountRepo.findByOfficialEmailID(offEmaiID);
		return account;	
	}


	@Override
	public Employee saveEmployee(Employee account) {
		// TODO Auto-generated method stub
		Employee member = accountRepo.save(account);
		return member;
	}


	@Override
	public EmployeeRole saveRole(EmployeeRole role) {
		// TODO Auto-generated method stub
		EmployeeRole employeeRole = roleRepo.save(role);
		return employeeRole;
	}


	@Override
	public ArrayList<ProjectMemberDetail> findByLeadId(Long leadId) {
		ArrayList<ProjectMemberDetail> detailsList = detaisRepo.findByLeadId(leadId);
		return detailsList;
	}


	@Override
	public ArrayList<ProjectMemberDetail> findByAccountId(Long empId) {
		ArrayList<ProjectMemberDetail> detailsList = detaisRepo.findByAccountId(empId);
		return detailsList;
	}


	@Override
	public ArrayList<ProjectMemberDetail> findByProjectId(Long projectId) {
		ArrayList<ProjectMemberDetail> detailsList = detaisRepo.findByProjectId(projectId);
		return detailsList;
	}


	@Override
	public ArrayList<Client> findAllClients() {
		EntityManager entity = this.emf.createEntityManager();
		List<Client> clients = entity.createQuery("SELECT c from Client c where c.clientId != 1", Client.class).getResultList();
		return (ArrayList<Client>) clients;
	}


	@Override
	public ArrayList<Project> findAllProjects() {
		EntityManager entity = this.emf.createEntityManager();
		List<Project> projects = entity.createQuery("SELECT p from Project p where p.projectId != 1", Project.class).getResultList();
		return (ArrayList<Project>) projects;
	}


	@Override
	public ArrayList<Employee> findByExclude(Long projectId, Long leadId) {
		EntityManager entity = this.emf.createEntityManager();
		TypedQuery<Employee> query = entity.createQuery("SELECT e FROM Employee e WHERE e.accountId NOT IN (SELECT e.accountId FROM Employee e INNER JOIN  e.projectMemberDetail epm WHERE epm.leadId != :leadId and epm.projectId != :projectId) and e.accountId != 1",Employee.class);
		query.setParameter("leadId",leadId);
		query.setParameter("projectId",projectId);
		return (ArrayList<Employee>) query.getResultList();
	}
}
