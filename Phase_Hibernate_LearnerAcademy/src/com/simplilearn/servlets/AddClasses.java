package com.simplilearn.servlets;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Classess;
import com.simplilearn.entity.Subject;
import com.simplilearn.util.HibernateUtil;

/**
 * Servlet implementation class AddClasses
 */
@WebServlet("/add-class")
public class AddClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClasses() {
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
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		String classname = request.getParameter("classname");
		String subjects[] = request.getParameterValues("subject");	
		String value="";
				int count=0;
				if (subjects != null) 
				{
				
				    for (String sub : subjects) 
				    {
				    	
				  
				    	
				    	if(count==0)
				    	{
				    		value= sub;
				    		
				    	}
				    	else
				    	{
				    	
				    		value= value+","+sub;
				    		
				    	}
				    	//out.println("<h1> Teacher is "+value+" <h1>");
				    	count++;
				    	
				    }
				}
		
		
			String hql = "FROM Subject where subject_id in ("+value +")";
				//Query query = 
			
			List <Subject> subject = session.createQuery(hql).list();
				
			
			//out.println("<h1>Teacher Retrived<h1>");
			for(Subject sub: subject) 

			{
				//out.println("<h1>"+teach.getTeacherid()+teach.getTeacher_firstname()+teach.getTeacher_lastname()+"<h1>");
				
			}
			
			Classess classes = new Classess();
			
			classes.setClassname(classname);
			classes.setSubject(subject);
			
			
			// tx = session.beginTransaction();
			
			session.save(classes);
			tx.commit();
			session.close();
//		
//		
//		
//		
//		
//		//String lname = request.getParameter("teacher");
//		
//		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>");
//		
//		
//		out.println("<h1>Class Name<h1>");
//		out.println("<h1>"+classname+"<h1>");
		doGet(request, response);
	}

}
