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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Type;

/*
 * CREATE TABLE `tblprojectmembersdetail` (
   `ntProjectMemberID` bigint(20) NOT NULL AUTO_INCREMENT,
   `ntEmpID` bigint(20) NOT NULL,
   `ntLeadId` bigint(20) DEFAULT NULL,
   `ntPID` bigint(20) NOT NULL,
   `btCurrent` tinyint(1) NOT NULL,
   `bitRead` tinyint(1) DEFAULT NULL,
   `dtAssigned` date DEFAULT NULL,
   PRIMARY KEY (`ntProjectMemberID`),
   UNIQUE KEY `UQ__tblProje__1624D3E1382F5661` (`ntEmpID`,`ntLeadId`,`ntPID`),
   KEY `FK__tblProjec__ntLea__3B0BC30C` (`ntLeadId`),
   KEY `FK__tblProjec__ntPID__3BFFE745` (`ntPID`),
   CONSTRAINT `FK__tblProjec__ntEmp__3A179ED3` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblProjec__ntLea__3B0BC30C` FOREIGN KEY (`ntLeadId`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblProjec__ntPID__3BFFE745` FOREIGN KEY (`ntPID`) REFERENCES `tblproject` (`ntPID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1
 */
@Entity
@Table(name="tblprojectmembersdetail")
public class ProjectMemberDetail {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntProjectMemberID")
	private Long memberId;
	
	@Column(name="ntEmpID")
	private Long accountId;
	
	@Column(name="ntLeadId")
	private Long leadId;
	
	@Column(name="ntPID")
	private Long projectId;
	
	@Column(name="btCurrent",columnDefinition = "BIT")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean current;
	
	@Column(name="bitRead",columnDefinition = "BIT")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean read;
	
	@Column(name="dtAssigned")
	private Date assignedDate;
	
	@ManyToOne
	@JoinColumn(name="ntPID",referencedColumnName="ntPID",insertable=false,updatable=false)
	@JsonIgnore
	private Project project;
	
	@ManyToOne
	@JoinColumn(name="ntEmpID",referencedColumnName="ntEmpID",insertable=false,updatable=false)
	@JsonIgnore
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="ntLeadId",referencedColumnName="ntEmpID",insertable=false,updatable=false)
	@JsonIgnore
	private Employee lead;

	@OneToMany(targetEntity=Task.class,mappedBy="projectMember",
			cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private Set<Task> task = new HashSet<Task>();
	
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getLead() {
		return lead;
	}

	public void setLead(Employee lead) {
		this.lead = lead;
	}

	public Set<Task> getTask() {
		return task;
	}

	public void setTask(Set<Task> task) {
		this.task = task;
	}


}
