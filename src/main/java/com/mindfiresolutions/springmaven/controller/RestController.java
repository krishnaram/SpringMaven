package com.mindfiresolutions.springmaven.controller;

/**
 * Author: Ramakrishna Panni
 * Class: RestController
 * Details: Created to control all request coming to application
 */

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindfiresolutions.springmaven.models.Client;
import com.mindfiresolutions.springmaven.models.Employee;
import com.mindfiresolutions.springmaven.models.EmployeeRole;
import com.mindfiresolutions.springmaven.models.Project;
import com.mindfiresolutions.springmaven.models.ProjectMemberDetail;
import com.mindfiresolutions.springmaven.models.Result;
import com.mindfiresolutions.springmaven.service.AccoutService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	 @Autowired
	 private AccoutService accountService;
	
	 //Just begining of Project to check whether set up is working
	@RequestMapping(value = "/hello/{name}", method=RequestMethod.GET)
	public String renderHello(@PathVariable String name,Model model)
	{
		model.addAttribute(name);
		return "Hello";
		
	}
	
	//Home page request by after Login
	@RequestMapping(value = { "/homePage"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("homePage");
        return model;
    }
	
	//Add member by Lead 
	@RequestMapping(value = { "/addMember"}, method = RequestMethod.POST)
    public Result addMember(@RequestBody  Employee employee) {
		//To check whether username already exists
		Employee member = accountService.findAccountByUsername(employee.getEmployeeUserName());
		Result result = new Result(); 
		if(member == null)
		{
			//To check whether official MailID already exists
			 member = accountService.findByOfficialEmailID(employee.getOfficialEmailID());
			if(member == null)
			{
				Employee newMember = accountService.saveEmployee(employee);
				EmployeeRole role = new EmployeeRole();
				role.setAccountId(newMember.getAccountId());
				role.setRole("ROLE_USER");
				accountService.saveRole(role);
				result.setSuccess("User Created Successfully");
				return result;
			}
			result.setError("Official Email ID already exists");
			return result;
		}
		result.setError("Username already exists");
		return result; 
        
    }
	
	//To get list of projects for Lead 
	@RequestMapping(value = { "/listClients"}, method = RequestMethod.GET)
    public ArrayList<Client>  listClients() {
		ArrayList<Client> clients = accountService.findAllClients();
		return clients;
    }
	
	//To get list of projects for Lead 
		@RequestMapping(value = { "/listProjects"}, method = RequestMethod.GET)
	    public ArrayList<Project>  listProjects() {
			ArrayList<Project> projects= accountService.findAllProjects();
			return projects;
	    }
     
	//Login Failure Error handling and Logout handling 
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
    @RequestParam(value = "logout", required = false) String logout) {
         
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid Credentials provided.");
        }
 
        if (logout != null) {
            model.addObject("message", "Logged out  successfully.");
        }
 
        model.setViewName("loginPage");
        return model;
    }
    
  //Get Project Member Details 
  	@RequestMapping(value = { "/getMember"}, method = RequestMethod.POST)
      public ArrayList<Employee> getMembers(@RequestBody  ProjectMemberDetail member) {
  		//To check all Members under lead in that project
  		ArrayList<Employee> members = accountService.findByExclude(member.getProjectId(), member.getLeadId());
  		return members; 
          
      }
}
