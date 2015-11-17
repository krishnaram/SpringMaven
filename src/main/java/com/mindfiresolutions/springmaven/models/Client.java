package com.mindfiresolutions.springmaven.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="tblclient")
public class Client {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntClientID")
	private Long clientId;
	
	@Column(name="vcClientName")
	private String clientName;

	@Column(name="vcLocation")
	private String location;
	
	@Column(name="ofstTimeZone")
	private Date timeZone;
	
	@Column(name="vcCommunicationMode")
	private String communicationMode;
	
	@Column(name="vcContact")
	private String contact;

	@OneToMany(targetEntity=Project.class,mappedBy="client",
			cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private Set<Project> projects = new HashSet<Project>();
	
	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(Date timeZone) {
		this.timeZone = timeZone;
	}

	public String getCommunicationMode() {
		return communicationMode;
	}

	public void setCommunicationMode(String communicationMode) {
		this.communicationMode = communicationMode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public Client(){
		
	}
}
