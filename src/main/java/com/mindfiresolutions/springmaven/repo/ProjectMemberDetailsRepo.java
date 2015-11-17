package com.mindfiresolutions.springmaven.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfiresolutions.springmaven.models.ProjectMemberDetail;

public interface ProjectMemberDetailsRepo  extends JpaRepository<ProjectMemberDetail, Integer>{
	public ArrayList<ProjectMemberDetail> findByLeadId(Long leadId);
	public ArrayList<ProjectMemberDetail> findByAccountId(Long empId);
	public ArrayList<ProjectMemberDetail> findByProjectId(Long projectId);
}
