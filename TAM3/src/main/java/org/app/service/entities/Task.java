package org.app.service.entities;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task {
	
@Id
private Integer IdTask;
private Category TaskCategory;
@Temporal(TemporalType.DATE)
private Date startDateTask;
private Integer estimatedDuration;
private Integer remainingDuration;
@Temporal(TemporalType.DATE)
private Date finalDateTask;
private TaskStatuses TaskStatuses;
@ManyToOne
private Iteration iteration;
@ManyToOne
private Project project;
@ManyToOne
private Member member;

public Integer getIdTask() {
	return IdTask;
}
public void setIdTask(Integer idTask) {
	IdTask = idTask;
}
public Category getTaskCategory() {
	return TaskCategory;
}
public void setTaskCategory(Category taskCategory) {
	TaskCategory = taskCategory;
}
public Date getStartDateTask() {
	return startDateTask;
}
public void setStartDateTask(Date startDateTask) {
	this.startDateTask = startDateTask;
}
public Integer getEstimatedDuration() {
	return estimatedDuration;
}
public void setEstimatedDuration(Integer estimatedDuration) {
	this.estimatedDuration = estimatedDuration;
}
public Integer getRemainingDuration() {
	return remainingDuration;
}
public void setRemainingDuration(Integer remainingDuration) {
	this.remainingDuration = remainingDuration;
}
public Date getFinalDateTask() {
	return finalDateTask;
}
public void setFinalDateTask(Date finalDateTask) {
	this.finalDateTask = finalDateTask;
}
public TaskStatuses getTaskStatuses() {
	return TaskStatuses;
}
public void setTaskStatuses(TaskStatuses taskStatuses) {
	TaskStatuses = taskStatuses;
}
public Iteration getIteration() {
	return iteration;
}
public void setIteration(Iteration iteration) {
	this.iteration = iteration;
}
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
public Member getMember() {
	return member;
}
public void setMember(Member member) {
	this.member = member;
}

public Task(Integer idTask, Category taskCategory, Date startDateTask,
		Integer estimatedDuration, Integer remainingDuration,
		Date finalDateTask, org.app.service.entities.TaskStatuses taskStatuses,
		Iteration iteration, Project project, Member member) {
	super();
	IdTask = idTask;
	TaskCategory = taskCategory;
	this.startDateTask = startDateTask;
	this.estimatedDuration = estimatedDuration;
	this.remainingDuration = remainingDuration;
	this.finalDateTask = finalDateTask;
	TaskStatuses = taskStatuses;
	this.iteration = iteration;
	this.project = project;
	this.member = member;
}
public Task() {
	super();
}

@Override
public String toString() {
	return "Task [IdTask=" + IdTask + ", TaskCategory=" + TaskCategory
			+ ", startDateTask=" + startDateTask + ", estimatedDuration="
			+ estimatedDuration + ", remainingDuration=" + remainingDuration
			+ ", finalDateTask=" + finalDateTask + ", TaskStatuses="
			+ TaskStatuses + ", iteration=" + iteration + ", project="
			+ project + ", member=" + member + "]";
}


}
