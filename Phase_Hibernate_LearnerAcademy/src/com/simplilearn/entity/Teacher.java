package com.simplilearn.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author waz78153
 *
 */
@Entity
public class Teacher 
{
	
	@Id
	@GeneratedValue
	int teacherid;


	

	public int getTeacherid() 
	{
		return teacherid;
	}
	//public void setTeacherid(int teacherid) 
//	{
//		this.teacherid = teacherid;
//	}

//(mappedBy = "Teacher", cascade = CascadeType.ALL)
	
	public String getTeacher_firstname() 
	{
		return teacher_firstname;
	}
	public void setTeacher_firstname(String teacher_firstname) {
		this.teacher_firstname = teacher_firstname;
	}
	public String getTeacher_lastname() {
		return teacher_lastname;
	}
	public void setTeacher_lastname(String teacher_lastname) {
		this.teacher_lastname = teacher_lastname;
	}


	String teacher_firstname;
	String teacher_lastname;
	


	
}
