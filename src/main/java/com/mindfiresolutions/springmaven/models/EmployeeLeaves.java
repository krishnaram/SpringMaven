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
 * CREATE TABLE `tblempleaves` (
   `ntLeaveID` bigint(20) NOT NULL AUTO_INCREMENT,
   `ntEmpID` bigint(20) NOT NULL,
   `dtLeaveFrom` date NOT NULL,
   `dtLeaveTo` date NOT NULL,
   `vcReason` varchar(500) DEFAULT NULL,
   `btNEW` tinyint(1) NOT NULL,
   `vcStatus` varchar(20) DEFAULT 'Applied',
   `ntLeads` int(11) DEFAULT NULL,
   `ntLeadsVerified` int(11) DEFAULT NULL,
   `bitRead` tinyint(1) NOT NULL DEFAULT '1',
   `dtApplied`ntLeads date DEFAULT NULL,
   PRIMARY KEY (`ntLeaveID`),
   KEY `FK__tblEmpLea__ntEmp__725BF7F6` (`ntEmpID`),
   CONSTRAINT `FK__tblEmpLea__ntEmp__725BF7F6` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1*/
@Entity
@Table(name="tblempleaves")
public class EmployeeLeaves {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY) @Column(name="ntLeaveID")
	private Long leaveId;
	
	@Column(name="ntEmpID")
	private Long accountId;
	
	@Column(name="dtLeaveFrom")
	private Date leaveFrom;
	
	@Column(name="dtLeaveTo")
	private Date leaveTo;
	
	@Column(name="vcReason")
	private String reason;
	
	@Column(name="ntLeadsVerified")
	private int leadsVerified;
	
	@Column(name="btNEW",columnDefinition = "BIT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean newLeave;

	@Column(name="vcStatus")
	private String status;
	
	@Column(name="ntLeads")
	private int leads;
	
	@Column(name="bitRead",columnDefinition = "BIT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean read;
	
	@Column(name="dtApplied")
	private Date appliedDate;
	
	@ManyToOne
	@JoinColumn(name="ntEmpID", referencedColumnName = "ntEmpID", insertable = false, updatable = false)
	@JsonIgnore
	private Employee employee;

	
	@OneToMany(targetEntity = LeaveStatus.class, mappedBy = "leaves",
			cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<LeaveStatus> leaveStatus = new HashSet<LeaveStatus>();
	
	public Set<LeaveStatus> getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(Set<LeaveStatus> leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Date getLeaveFrom() {
		return leaveFrom;
	}

	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public Date getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getLeadsVerified() {
		return leadsVerified;
	}

	public void setLeadsVerified(int leadsVerified) {
		this.leadsVerified = leadsVerified;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getLeads() {
		return leads;
	}

	public void setLeads(int leads) {
		this.leads = leads;
	}

	public boolean getRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public boolean isNewLeave() {
		return newLeave;
	}

	public void setNewLeave(boolean newLeave) {
		this.newLeave = newLeave;
	}
	

}
