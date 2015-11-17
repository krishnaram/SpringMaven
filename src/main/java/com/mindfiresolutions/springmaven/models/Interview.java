package com.mindfiresolutions.springmaven.models;

import java.sql.Time;
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
import org.hibernate.annotations.Type;

/*
 * 
 * CREATE TABLE `tblinterview` (
   `ntInterviewID` bigint(20) NOT NULL AUTO_INCREMENT,
   `ntEmpID` bigint(20) NOT NULL,
   `ntIntervieweeID` bigint(20) NOT NULL,
   `dtDate` date NOT NULL,
   `tmTime` time NOT NULL,
   `bitStatus` tinyint(1) NOT NULL,
   `vcReason` varchar(50) DEFAULT NULL,
   `btRead` tinyint(1) DEFAULT '1',
   `vcReport` varchar(250) DEFAULT NULL,
   PRIMARY KEY (`ntInterviewID`),
   KEY `FK__tblInterv__ntEmp__6ABAD62E` (`ntEmpID`),
   KEY `FK__tblInterv__ntInt__6BAEFA67` (`ntIntervieweeID`),
   CONSTRAINT `FK__tblInterv__ntEmp__6ABAD62E` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblInterv__ntInt__6BAEFA67` FOREIGN KEY (`ntIntervieweeID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1
 *
 */
@Entity
@Table(name="tblinterview")
public class Interview {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntInterviewID")
	private Long interviewId;
	
	@Column(name="ntEmpID")
	private Long accountId;
	
	@Column(name="ntIntervieweeID")
	private Long intervieweeId;
	
	@Column(name="dtDate")
	private Date interviewDate;
	
	@Column(name="tmTime")
	private Time interviewTime;
	
	@Column(name="bitStatus",nullable=false,columnDefinition="BIT")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean statusFlag;
	
	@Column(name="vcReason")
	private String reason;
	
	@Column(name="btRead",nullable=false,columnDefinition="BIT")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean read;
	
	@Column(name="vcReport")
	private String report;
	
	@ManyToOne
	@JoinColumn(name="ntEmpID",referencedColumnName="ntEmpID",insertable=false,updatable=false)
	@JsonIgnore
	private Employee employee;

	public Long getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Long interviewId) {
		this.interviewId = interviewId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getIntervieweeId() {
		return intervieweeId;
	}

	public void setIntervieweeId(Long intervieweeId) {
		this.intervieweeId = intervieweeId;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public Time getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(Time interviewTime) {
		this.interviewTime = interviewTime;
	}

	public boolean isStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(boolean statusFlag) {
		this.statusFlag = statusFlag;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
