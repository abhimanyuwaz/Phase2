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



@Entity
public class Subject 
{

	String subjectname;
	
	@Id
	@GeneratedValue
	int subject_id;
	

	
	@ManyToMany
	private List <Teacher> teacher;
	public List<Teacher> getTeacher() 
	{
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	

	
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
	public int getSubject_id() 
	{
		return subject_id;
	}
	
//	public void setSubject_id(int subject_id) 
//	{
//		this.subject_id = subject_id;
//	}
//	
	
}
