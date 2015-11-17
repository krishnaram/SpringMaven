package com.mindfiresolutions.springmaven.models;

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
 * CREATE TABLE `tblfeedback` (
   `ntEmpID` bigint(20) NOT NULL,
   `ntFeedBackBy` bigint(20) NOT NULL,
   `vcFeedback` longtext,
   `dtDate` date DEFAULT NULL,
   `btRead` tinyint(1) DEFAULT '1',
   KEY `FK__tblFeedba__ntEmp__5A846E65` (`ntEmpID`),
   KEY `FK__tblFeedba__ntFee__5B78929E` (`ntFeedBackBy`),
   CONSTRAINT `FK__tblFeedba__ntEmp__5A846E65` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblFeedba__ntFee__5B78929E` FOREIGN KEY (`ntFeedBackBy`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1*/
@Entity
@Table(name="tblfeedback")
public class Feedback {
	
	public Long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY) @Column(name="ntFeedbackID")
	private Long feedbackId;
	
	@Column(name="ntEmpID")
	private Long accountId;
	
	@Column(name="ntFeedBackBy")
	private Long leadFeedback;
	
	@Column(name="vcFeedback")
	private String feedback ;
	
	@Column(name="dtDate")
	private Date feedbackDate ;
	
	@Column(name="btRead",columnDefinition = "BIT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean read;

	@ManyToOne
	@JoinColumn(name="ntEmpID", referencedColumnName = "ntEmpID", insertable = false, updatable = false)
	@JsonIgnore
	private Employee employee;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getLeadFeedback() {
		return leadFeedback;
	}

	public void setLeadFeedback(Long leadFeedback) {
		this.leadFeedback = leadFeedback;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Date getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
