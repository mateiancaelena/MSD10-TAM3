package org.app.service.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Member extends Employee {
private Integer IdMember;
private String MemberName;
private Role Role;
private Specialization Specialization;
@ManyToOne
private Team team;
@OneToMany
private List<Task>tasks=new ArrayList<Task>();

public Integer getIdMember() {
	return IdMember;
}
public void setIdMember(Integer idMember) {
	IdMember = idMember;
}
public String getMemberName() {
	return MemberName;
}
public void setMemberName(String memberName) {
	MemberName = memberName;
}
public Role getRole() {
	return Role;
}
public void setRole(Role role) {
	Role = role;
}
public Specialization getSpecialization() {
	return Specialization;
}
public void setSpecialization(Specialization specialization) {
	Specialization = specialization;
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

public Member(Integer idEmployee, org.app.service.entities.Gender gender,
		Date birthdate, String cNP, String position, Date hireDate,
		Double baseSalary, Integer idMember, String memberName,
		org.app.service.entities.Role role,
		org.app.service.entities.Specialization specialization, Team team,
		List<Task> tasks) {
	super(idEmployee, gender, birthdate, cNP, position, hireDate, baseSalary);
	IdMember = idMember;
	MemberName = memberName;
	Role = role;
	Specialization = specialization;
	this.team = team;
	this.tasks = tasks;
}
public Member() {
	super();
}

@Override
public String toString() {
	return "Member [IdMember=" + IdMember + ", MemberName=" + MemberName
			+ ", Role=" + Role + ", Specialization=" + Specialization
			+ ", team=" + team + ", tasks=" + tasks + "]";
}



}
