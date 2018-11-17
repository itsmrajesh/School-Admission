package com.ncet.speneous;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String Schoolname;
	private String Schoolboard;
	private String contactNumber;
	private int SchoolId;
	private int classNumber;
	private int totalSeats;
	private int currentStrength;

	public School(String schoolname, String schoolboard, String contactNumber, int schoolId, int classNumber,
			int currentStrength,int totalSeats) {
		
		this.Schoolname = schoolname;
		this.Schoolboard = schoolboard;
		this.contactNumber = contactNumber;
		this.SchoolId = schoolId;
		this.classNumber = classNumber;
		this.totalSeats = totalSeats;
		this.currentStrength = currentStrength;
	
	}
	public String getSchoolname() {
		return Schoolname;
	}
	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}
	public String getSchoolboard() {
		return Schoolboard;
	}
	public void setSchoolboard(String schoolboard) {
		Schoolboard = schoolboard;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getSchoolId() {
		return SchoolId;
	}
	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getCurrentStrength() {
		return currentStrength;
	}
	public void setCurrentStrength(int currentStrength) {
		this.currentStrength = currentStrength;
		
	}

 public void print()
{
	System.out.println("name:"+Schoolname);
}

}
