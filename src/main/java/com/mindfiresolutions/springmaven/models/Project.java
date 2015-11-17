package com.mindfiresolutions.springmaven.models;
/*
 * Author : Ramakrishna Panni
 * Class: Project 
 * Details: Created for Project bean creation
 * */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

/*
 * 
 * CREATE TABLE `tblproject` (
   `ntPID` bigint(20) NOT NULL AUTO_INCREMENT,
   `vcProjectName` varchar(50) NOT NULL,
   `vcDetails` varchar(150) NOT NULL,
   `vcDescription` varchar(150) DEFAULT NULL,
   `ntClientID` bigint(20) DEFAULT NULL,
   `vcServerTechnologies` varchar(150) NOT NULL,
   `vcUITechnologies` varchar(150) NOT NULL,
   `vcDeliveryUploadDetails` varchar(150) NOT NULL,
   `vcDatabase` varchar(50) NOT NULL,
   `dtStartDate` date NOT NULL,
   `dtDeliveryDate` date NOT NULL,
   PRIMARY KEY (`ntPID`),
   KEY `FK__tblProjec__ntCli__2AD55B43` (`ntClientID`),
   CONSTRAINT `FK__tblProjec__ntCli__2AD55B43` FOREIGN KEY (`ntClientID`) REFERENCES `tblclient` (`ntClientID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1
 * */
@Entity
@Table(name="tblproject")
public class Project {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntPID")
	private Long projectId;
	
	@Column(name="vcProjectName")
	private String projectName;
	
	@Column(name="vcDetails")
	private String details;
	
	@Column(name="vcDescription")
	private String description;
	
	@Column(name="ntClientID")
	private Long clientId;
	
	@Column(name="vcServerTechnologies")
	private String serverTechnologies;
	
	@Column(name="vcUITechnologies")
	private String uiTechnologies;
	
	@Column(name="vcDeliveryUploadDetails")
	private String deliveryUploadDetails;

	@Column(name="vcDatabase")
	private String database;
	
	@Column(name="dtStartDate")
	private Date startDate;
	
	@Column(name="dtDeliveryDate")
	private Date deliveryDate;

	@ManyToOne
	@JoinColumn(name="ntClientID", referencedColumnName = "ntClientID", insertable = false, updatable = false)
	@JsonIgnore
	private Client client;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setVcProjectName(String vcProjectName) {
		this.projectName = vcProjectName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getServerTechnologies() {
		return serverTechnologies;
	}

	public void setServerTechnologies(String serverTechnologies) {
		this.serverTechnologies = serverTechnologies;
	}

	public String getUiTechnologies() {
		return uiTechnologies;
	}

	public void setUiTechnologies(String uiTechnologies) {
		this.uiTechnologies = uiTechnologies;
	}

	public String getDeliveryUploadDetails() {
		return deliveryUploadDetails;
	}

	public void setDeliveryUploadDetails(String deliveryUploadDetails) {
		this.deliveryUploadDetails = deliveryUploadDetails;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
}
