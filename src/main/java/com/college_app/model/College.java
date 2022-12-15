package com.college_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="college")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long collegeId;
private String collegeName;
private String address;
private int collegeCode;

public College() {
	super();
}


public College(long collegeId, String collegeName, String address, int collegeCode) {
	super();
	this.collegeId = collegeId;
	this.collegeName = collegeName;
	this.address = address;
	this.collegeCode = collegeCode;
}


public long getCollegeId() {
	return collegeId;
}
public void setCollegeId(long collegeId) {
	this.collegeId = collegeId;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getCollegeCode() {
	return collegeCode;
}
public void setCollegeCode(int collegeCode) {
	this.collegeCode = collegeCode;
}

}
