package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Subject;
import com.simplilearn.entity.Teacher;
import com.simplilearn.util.HibernateUtil;

/**
 * Servlet implementation class AddSubject
 */
@WebServlet("/AddSubject")
public class AddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String sname = request.getParameter("subjectname");
		
		//Sting id=request.get
		Subject s1= new Subject();
		s1.setSubjectname(sname);
		
		Teacher t1= new Teacher();
		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		session.save(t1);
		tx.commit();
		
		

		PrintWriter out = response.getWriter();
//		out.println("<html><body>");
//		
//		out.println("<h1>Teacher Added<h1>");
		//doGet(request, response);
	
		

		
		out.println("<h1>"+sname+"<h1>");
		
	
		
		String languages[] = request.getParameterValues("teacher");
		//String teacherid[] = request.getParameterValues("id");
		
		//out.println("<h1> Length of the Languages "+languages.length+" <h1>");
	//	out.println("<h1> Languages <h1>");

	
		String value="";
		int count=0;
		if (languages != null) 
		{
		
		    for (String lang : languages) 
		    {
		    	Integer.parseInt(lang);
		  
		    	
		    	if(count==0)
		    	{
		    		value= lang;
		    		
		    	}
		    	else
		    	{
		    	
		    		value= value+","+lang;
		    		
		    	}
		    	//out.println("<h1> Teacher is "+value+" <h1>");
		    	count++;
		    	
		    }
		}
	
		//out.println("<h1> Languages Final"+value+" <h1>");
		//1617,17
		//out.println("<h1>Value in LANG<h1>");
		//out.println("<h1>"+value+"<h1>");
		
		String hql = "FROM Teacher where teacherid in ("+value +")";
		//Query query = 
	List <Teacher> teacher = session.createQuery(hql).list();
		
	
	//out.println("<h1>Teacher Retrived<h1>");
	for(Teacher teach: teacher) 

	{
		out.println("<h1>"+teach.getTeacherid()+teach.getTeacher_firstname()+teach.getTeacher_lastname()+"<h1>");
		
	}
	
	Subject subject = new Subject();
	
	subject.setSubjectname(sname);
	subject.setTeacher(teacher);
	
	
	tx = session.beginTransaction();
	session.save(subject);
	tx.commit();
	session.close();

	
	//		if (languages != null) 
//		{
//		    System.out.println("Teacher id  are: ");
//		    for (String id : teacherid) 
//		    {
//		    	out.println("<h1>"+id+"<h1>");
//		    
//		    }
//		}
		
		
	
		
//		Teacher t1= new Teacher();
//		t1.setTeacher_firstname(lname);
//		t1.setTeacher_lastname(lname);
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(t1);
//		tx.commit();
//		session.close();
		
	out.println("<html><body>");
	
	out.println("<h1>Subject Added<h1>");
	
		doGet(request, response);
	}

}
