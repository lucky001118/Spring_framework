package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	@Column(name="project_name")
	private String projectName;
	@ManyToMany(mappedBy = "projects")
	private List<EMP> emps;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projectName, List<EMP> emps) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emps = emps;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<EMP> getEmps() {
		return emps;
	}

	public void setEmps(List<EMP> emps) {
		this.emps = emps;
	}
	
	

}
