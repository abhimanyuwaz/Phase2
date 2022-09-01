package com.simplilearn.entity;

import javax.persistence.CascadeType;

import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
@Entity
public class Classess 
{

	String classname;
	@Id
	@GeneratedValue
	int class_id;
	
	
@ManyToMany

private List <Subject> subject;


public List<Subject> getSubject() 
{
	return subject;
}
public void setSubject(List<Subject> subject) {
	this.subject = subject;
}

//@OneToMany
//private List <Student> stu;
//
//public List<Student> getStu() 
//{
//	return stu;
//}
//public void setStu(List<Student> stu) {
//	this.stu = stu;
//}



public void setClass_id(int class_id) {
	this.class_id = class_id;
}

	public String getClassname() 
	{
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getClass_id() {
		return class_id;
	}
//	public void setClass_id(int class_id) {
//		this.class_id = class_id;
//	}
	
	
	
}
