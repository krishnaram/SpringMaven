package com.mindfiresolutions.springmaven.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.stereotype.Component;

import com.mindfiresolutions.springmaven.models.Employee;
import com.mindfiresolutions.springmaven.models.EmployeeRole;
import com.mindfiresolutions.springmaven.service.AccoutService;

@Component("AuthenticationProvider")
public class CustomAuthenticationProvider implements AuthenticationProvider {
 
	 @Autowired
	 private AccoutService accountService;
	
	 @Override
	 public Authentication authenticate(Authentication authentication) 
    	      throws AuthenticationException {
    	
	    	  String username = authentication.getName();
	    	  String password = (String) authentication.getCredentials();
	    	  
    	        Employee member = accountService.findAccountByUsername(username);
    	        
               if (member == null || !member.getEmployeeUserName().equalsIgnoreCase(username)) {
                    throw new BadCredentialsException("Username not found.");
                }
         
                if (!password.equals(member.getPassword())) {
                    throw new BadCredentialsException("Wrong password.");
                }
                Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
                for (EmployeeRole  employeeRole : member.getEmpRoles()) {
        			setAuths.add(new SimpleGrantedAuthority(employeeRole.getAuthority()));
        		}
                 
                
               
                return new UsernamePasswordAuthenticationToken(member, password, setAuths);
    	        
    	    }

		@Override
		public boolean supports(Class<?> authentication) {
			     return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
		   
			}

}