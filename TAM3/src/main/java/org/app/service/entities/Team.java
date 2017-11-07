package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Team {
	
@Id
private Integer TeamId;
private String Competences;
private Specialization Specialization;
@OneToMany
private List<Member>members=new ArrayList<Member>();

public Integer getTeamId() {
	return TeamId;
}
public void setTeamId(Integer teamId) {
	TeamId = teamId;
}
public String getCompetences() {
	return Competences;
}
public void setCompetences(String competences) {
	Competences = competences;
}
public Specialization getSpecialization() {
	return Specialization;
}
public void setSpecialization(Specialization specialization) {
	Specialization = specialization;
}
public List<Member> getMembers() {
	return members;
}
public void setMembers(List<Member> members) {
	this.members = members;
}

public Team(Integer teamId, String competences,
		org.app.service.entities.Specialization specialization, List<Member> members) {
	super();
	TeamId = teamId;
	Competences = competences;
	Specialization = specialization;
	this.members = members;
}
public Team() {
	super();
}

@Override
public String toString() {
	return "Team [TeamId=" + TeamId + ", Competences=" + Competences
			+ ", Specialization=" + Specialization 
			+ ", members=" + members + "]";
}


}
