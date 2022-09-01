package com.simplilearn.entity;

//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity


public class Student 

{

	private String fname;
	private String lname;
	@Id
	@GeneratedValue
	private int student_id;
	
	private String address;

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getStudent_id() {
		return student_id;
	}
//	public void setStudent_id(int student_id) {
//		this.student_id = student_id;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@ManyToOne
	private Classess classes;

	public Classess getClasses() 
	{
		return classes;
	}
	public void setClasses(Classess classes) 
	{
		this.classes = classes;
	}
	
	
}
