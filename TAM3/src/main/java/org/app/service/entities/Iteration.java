package org.app.service.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Iteration {
@Id
private Integer IdIteration;
private String Description;
@Temporal(TemporalType.DATE)
private Date startDateIteration;
@Temporal(TemporalType.DATE)
private Date finalDateIteration;
@OneToMany
private List<Task>tasks=new ArrayList<Task>();

public Integer getIdIteration() {
	return IdIteration;
}
public void setIdIteration(Integer idIteration) {
	IdIteration = idIteration;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public Date getStartDateIteration() {
	return startDateIteration;
}
public void setStartDateIteration(Date startDateIteration) {
	this.startDateIteration = startDateIteration;
}
public Date getFinalDateIteration() {
	return finalDateIteration;
}
public void setFinalDateIteration(Date finalDateIteration) {
	this.finalDateIteration = finalDateIteration;
}
public List<Task> getTasks() {
	return tasks;
}
public void setTasks(List<Task> tasks) {
	this.tasks = tasks;
}

public Iteration(Integer idIteration, String description,
		Date startDateIteration, Date finalDateIteration, List<Task> tasks) {
	super();
	IdIteration = idIteration;
	Description = description;
	this.startDateIteration = startDateIteration;
	this.finalDateIteration = finalDateIteration;
	this.tasks = tasks;
}
public Iteration() {
	super();
}

@Override
public String toString() {
	return "Iteration [IdIteration=" + IdIteration + ", Description="
			+ Description + ", startDateIteration=" + startDateIteration
			+ ", finalDateIteration=" + finalDateIteration + ", tasks=" + tasks
			+ "]";
}


}
