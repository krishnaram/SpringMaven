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

/*
 * CREATE TABLE `tblmails` (
   `ntMessageID` bigint(20) NOT NULL AUTO_INCREMENT,
   `vcMessage` varchar(500) DEFAULT NULL,
   `ntEmpID` bigint(20) NOT NULL,
   `dtDateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
   `vcSubject` varchar(100) DEFAULT 'Message',
   PRIMARY KEY (`ntMessageID`),
   KEY `FK__tblEmploy__ntEmp__075714DC` (`ntEmpID`),
   CONSTRAINT `FK__tblEmploy__ntEmp__075714DC` FOREIGN KEY (`ntEmpID`) REFERENCES `tblemployee` (`ntEmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1
 */
@Entity
@Table(name="tblmails")
public class Mails {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntMessageID")
	private Long mailId;
	
	@Column(name="vcMessage")
	private String mail;
	
	@Column(name="ntEmpID")
	private Long accountd;
	
	@Column(name="dtDateTime")
	private Date dateTime;
	
	@Column(name="vcSubject")
	private String subject;
	
	@ManyToOne
	@JoinColumn(name="ntEmpID",referencedColumnName="ntEmpID",insertable=false,updatable=false)
	@JsonIgnore
	private Employee employee;

	
	@OneToMany(targetEntity=MailStatus.class,mappedBy="mail",
			cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private Set<MailStatus> mailStatus = new HashSet<MailStatus>();
	
	public Set<MailStatus> getMailStatus() {
		return mailStatus;
	}

	public void setMailStatus(Set<MailStatus> mailStatus) {
		this.mailStatus = mailStatus;
	}

	public Long getMailId() {
		return mailId;
	}

	public void setMailId(Long mailId) {
		this.mailId = mailId;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getAccountd() {
		return accountd;
	}

	public void setAccountd(Long accountd) {
		this.accountd = accountd;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
