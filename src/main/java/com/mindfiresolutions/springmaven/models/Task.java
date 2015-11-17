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
import org.hibernate.annotations.Type;

/*
 * CREATE TABLE `tbltask` (
   `ntProjectMemberID` bigint(20) DEFAULT NULL,
   `vcTask` varchar(150) DEFAULT NULL,
   `vcStatus` varchar(150) DEFAULT NULL,
   `bitRead` tinyint(1) NOT NULL DEFAULT '1',
   `ntTaskID` bigint(20) NOT NULL AUTO_INCREMENT,
   PRIMARY KEY (`ntTaskID`),
   KEY `FK__tblTaskGi__ntPro__4D2A7347` (`ntProjectMemberID`),
   CONSTRAINT `FK__tblTaskGi__ntPro__4D2A7347` FOREIGN KEY (`ntProjectMemberID`) REFERENCES `tblprojectmembersdetail` (`ntProjectMemberID`) ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1
 */
@Entity
@Table(name="tbltask")
public class Task {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="ntTaskID") 
	private Long taskId;
	
	@Column(name="ntProjectMemberID")
	private Long projectMemberId;
	
	@Column(name="vcTask")
	private String task;
	
	@Column(name="vcStatus")
	private String status;
	
	@Column(name="bitRead",columnDefinition="BIT")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean read;

	@ManyToOne
	@JoinColumn(name="ntProjectMemberID",referencedColumnName="ntProjectMemberID",insertable=false,updatable=false)
	@JsonIgnore
	private ProjectMemberDetail projectMember;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getProjectMemberId() {
		return projectMemberId;
	}

	public void setProjectMemberId(Long projectMemberId) {
		this.projectMemberId = projectMemberId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public ProjectMemberDetail getProjectMember() {
		return projectMember;
	}

	public void setProjectMember(ProjectMemberDetail projectMember) {
		this.projectMember = projectMember;
	}
	
}
