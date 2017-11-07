package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Employee {
@Id
private Integer IdEmployee;
private Gender Gender;
@Temporal(TemporalType.DATE)
private Date Birthdate;
private String CNP;
private String Position;
@Temporal(TemporalType.DATE)
private Date HireDate;
private Double BaseSalary;

public Integer getIdEmployee() {
	return IdEmployee;
}
public void setIdEmployee(Integer idEmployee) {
	IdEmployee = idEmployee;
}
public Gender getGender() {
	return Gender;
}
public void setGender(Gender gender) {
	Gender = gender;
}
public Date getBirthdate() {
	return Birthdate;
}
public void setBirthdate(Date birthdate) {
	Birthdate = birthdate;
}
public String getCNP() {
	return CNP;
}
public void setCNP(String cNP) {
	CNP = cNP;
}
public String getPosition() {
	return Position;
}
public void setPosition(String position) {
	Position = position;
}
public Date getHireDate() {
	return HireDate;
}
public void setHireDate(Date hireDate) {
	HireDate = hireDate;
}
public Double getBaseSalary() {
	return BaseSalary;
}
public void setBaseSalary(Double baseSalary) {
	BaseSalary = baseSalary;
}

public Employee(Integer idEmployee, org.app.service.entities.Gender gender,
		Date birthdate, String cNP, String position, Date hireDate,
		Double baseSalary) {
	super();
	IdEmployee = idEmployee;
	Gender = gender;
	Birthdate = birthdate;
	CNP = cNP;
	Position = position;
	HireDate = hireDate;
	BaseSalary = baseSalary;
}

public Employee() {
	super();
}

@Override
public String toString() {
	return "Employee [IdEmployee=" + IdEmployee + ", Gender=" + Gender
			+ ", Birthdate=" + Birthdate + ", CNP=" + CNP + ", Position="
			+ Position + ", HireDate=" + HireDate + ", BaseSalary="
			+ BaseSalary + "]";
}

}
