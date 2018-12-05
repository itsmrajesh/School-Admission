package com.ncet.speneous;


public class Student {
private String studentName;
private int studentId;
private String fatherName;
private String motherName;
private int contact;
private String schoolAdmittedTo;

Student(String studentName,int studentId,String fatherName,String motherName,int contact,String schoolAdmittedTo){
	this.studentName=studentName;
	this.fatherName=fatherName;
	this.motherName=motherName;
	this.contact=contact;
	this.schoolAdmittedTo=schoolAdmittedTo;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public String getSchoolAdmittedTo() {
	return schoolAdmittedTo;
}
public void setSchoolAdmittedTo(String schoolAdmittedTo) {
	this.schoolAdmittedTo = schoolAdmittedTo;
}

public void print() {
	System.out.println("Stuent name is "+studentName);
	System.out.println("Father's name is "+fatherName);
	System.out.println("Mother's name is "+motherName);
	System.out.println("Contact Number is "+contact);
	System.out.println("Stuent  is admitted to "+schoolAdmittedTo);



	
}
}

}
