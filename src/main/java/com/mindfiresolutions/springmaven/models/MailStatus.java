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
 * CREATE TABLE `tblmailread` (
   `ntMessageID` bigint(20) DEFAULT NULL,
   `ntEmpID` bigint(20) DEFAULT NULL,
   KEY `FK__tblMessag__ntMes__0A338187` (`ntMessageID`),
   KEY `FK__tblMessag__ntEmp__0B27A5C0` (`ntEmpID`),
   CONSTRAINT `FK__tblMessag__ntEmp__0B27A5C0` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
   CONSTRAINT `FK__tblMessag__ntMes__0A338187` FOREIGN KEY (`ntMessageID`) REFERENCES `tblmails` (`ntMessageID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1
 */
@Entity
@Table(name="tblmailread")
public class MailStatus {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntMailReadID")
	private Long mailStatusId;

	@Column(name="ntMessageID")
	private Long mailId;
	
	@Column(name="ntEmpID")
	private Long accountId;
	
	@ManyToOne
	@JoinColumn(name="ntEmpID",referencedColumnName="ntEmpID",insertable=false,updatable=false )
	@JsonIgnore
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="ntMessageID",referencedColumnName="ntMessageID",insertable=false,updatable=false )
	@JsonIgnore	
	private Mails mail;

	public Long getMailStatusId() {
		return mailStatusId;
	}

	public void setMailStatusId(Long mailStatusId) {
		this.mailStatusId = mailStatusId;
	}

	public Long getMailId() {
		return mailId;
	}

	public void setMailId(Long mailId) {
		this.mailId = mailId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Mails getMail() {
		return mail;
	}

	public void setMail(Mails mail) {
		this.mail = mail;
	}
	
	
}
