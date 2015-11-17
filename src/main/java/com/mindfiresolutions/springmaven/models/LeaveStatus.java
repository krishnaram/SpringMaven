package com.mindfiresolutions.springmaven.models;

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
 * CREATE TABLE `tblleavestatus` (
   `ntLeaveID` bigint(20) DEFAULT NULL,
   `ntEmpID` bigint(20) DEFAULT NULL,
   `ntLeadID` bigint(20) DEFAULT NULL,
   `vcStatus` varchar(150) DEFAULT NULL,
   KEY `FK__tblLeaveS__ntLea__762C88DA` (`ntLeaveID`),
   KEY `FK__tblLeaveS__ntEmp__7720AD13` (`ntEmpID`),
   KEY `FK__tblLeaveS__ntLea__7814D14C` (`ntLeadID`),
   CONSTRAINT `FK__tblLeaveS__ntEmp__7720AD13` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblLeaveS__ntLea__762C88DA` FOREIGN KEY (`ntLeaveID`) REFERENCES `tblempleaves` (`ntLeaveID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblLeaveS__ntLea__7814D14C` FOREIGN KEY (`ntLeadID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1
 */
@Entity
@Table(name="tblleavestatus")
public class LeaveStatus {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY) @Column(name="ntLeaveStatusID")
	private Long leaveStatusId;
	
	
	@Column(name="ntLeaveID")
	private Long leaveId;
	
	@Column(name="ntEmpID")
	private Long accountId;

	@Column(name="ntLeadID")
	private Long leadId;
	
	@Column(name="vcStatus")
	private String status;
	
	public Long getLeaveStatusId() {
		return leaveStatusId;
	}

	public void setLeaveStatusId(Long leaveStatusId) {
		this.leaveStatusId = leaveStatusId;
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

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getLeads() {
		return leads;
	}

	public void setLeads(Employee leads) {
		this.leads = leads;
	}

	public EmployeeLeaves getLeaves() {
		return leaves;
	}

	public void setLeaves(EmployeeLeaves leaves) {
		this.leaves = leaves;
	}

	@ManyToOne
	@JoinColumn(name="ntEmpID", referencedColumnName = "ntEmpID", insertable = false, updatable = false)
	@JsonIgnore
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="ntLeadID", referencedColumnName = "ntEmpID", insertable = false, updatable = false)
	@JsonIgnore
	private Employee leads;
	
	@ManyToOne
	@JoinColumn(name="ntLeaveID", referencedColumnName = "ntLeaveID", insertable = false, updatable = false)
	@JsonIgnore
	private EmployeeLeaves leaves;
	

}
