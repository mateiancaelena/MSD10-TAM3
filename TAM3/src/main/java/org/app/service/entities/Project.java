package org.app.service.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Project {
@Id
private Integer IdProject;
private String ProjectName;
@Temporal(TemporalType.DATE)
private Date startDate;
@Temporal(TemporalType.DATE)
private Date finalDate;
@OneToOne
private Team team;
@OneToMany
private List<Task>tasks=new ArrayList<Task>();

public Integer getIdProject() {
	return IdProject;
}
public void setIdProject(Integer idProject) {
	IdProject = idProject;
}
public String getProjectName() {
	return ProjectName;
}
public void setProjectName(String projectName) {
	ProjectName = projectName;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getFinalDate() {
	return finalDate;
}
public void setFinalDate(Date finalDate) {
	this.finalDate = finalDate;
}
public Team getTeam() {
	return team;
}
public void setTeam(Team team) {
	this.team = team;
}
public List<Task> getTasks() {
	return tasks;
}
public void setTasks(List<Task> tasks) {
	this.tasks = tasks;
}

public Project(Integer idProject, String projectName, Date startDate,
		Date finalDate, Team team, List<Task> tasks) {
	super();
	IdProject = idProject;
	ProjectName = projectName;
	this.startDate = startDate;
	this.finalDate = finalDate;
	this.team = team;
	this.tasks = tasks;
}
public Project() {
	super();
}

@Override
public String toString() {
	return "Project [IdProject=" + IdProject + ", ProjectName=" + ProjectName
			+ ", startDate=" + startDate + ", finalDate=" + finalDate
			+ ", team=" + team + ", tasks=" + tasks + "]";
}

}
