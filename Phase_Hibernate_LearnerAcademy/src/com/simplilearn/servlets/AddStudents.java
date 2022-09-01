package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Classess;
import com.simplilearn.entity.Student;
import com.simplilearn.util.HibernateUtil;

/**
 * Servlet implementation class AddStudents
 */
@WebServlet("/add-student")
public class AddStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudents() {
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
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
	    String address = request.getParameter("address");
	
	
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		
		out.println("<h1>Class Name<h1>");
		out.println("<h1>"+fname+lname+"<h1>");
		
		
		
		String clas = request.getParameter("class");	
		
		out.println("<h1> Print "+clas+"<h1>");
		
//		for(int i =0;i<clas.length;i++)
//		{
//			out.println("<h1> Print "+clas[i]+"<h1>");
//
//			
//		}
		
	//	if(1)
		{
			
		
		
//		String value="";
//				int count=0;
//				if (clas != null) 
//				{
//				
//				    for (String cls : clas) 
//				    {
//				    	
//				  
//				    	
//				    	if(count==0)
//				    	{
//				    		value= cls;
//				    		
//				    	}
//				    	else
//				    	{
//				    	
//				    		value= value+","+cls;
//				    		
//				    	}
//				    	//out.println("<h1> Teacher is "+value+" <h1>");
//				    	count++;
//				    	
//				    }
//				}
			
				//out.println("<h1> Languages Final"+value+" <h1>");
				//1617,17
				//out.println("<h1>Value in LANG<h1>");
				//out.println("<h1>"+value+"<h1>");
				
				String hql = "FROM Classess where class_id =("+clas+")";
				//Query query = 
				
				SessionFactory sf = HibernateUtil.getSessionFactory();
				Session session = sf.openSession();
				Transaction tx = session.beginTransaction();
			List  <Classess>classes = session.createQuery(hql).list();
				
			Classess savecls=new Classess();
			
			
			
			for(Classess calss:classes) 
			{
				
				savecls.setClass_id(calss.getClass_id());
				savecls.setClassname(calss.getClassname());
				savecls.setSubject(calss.getSubject());
				
				
				out.println("<h1> Class Name Entered"+calss.getClassname()+"<h1>");
			
			}
			
			//out.println("<h1>Teacher Retrived<h1>");
			
			
			Student student = new Student();
			
			student.setFname(fname);
			student.setLname(lname);
			student.setClasses(savecls);
			student.setAddress(address);
			
			
			//tx = session.beginTransaction();
			
			session.save(student);
			
			tx.commit();
			session.close();
//			
			
//				if (languages != null) 
//				{
//				    System.out.println("Teacher id  are: ");
//				    for (String id : teacherid) 
//				    {
//				    	out.println("<h1>"+id+"<h1>");
//				    
//				    }
//				}
				
				
			
				
//				Teacher t1= new Teacher();
//				t1.setTeacher_firstname(lname);
//				t1.setTeacher_lastname(lname);
//				SessionFactory sf = HibernateUtil.getSessionFactory();
//				Session session = sf.openSession();
//				Transaction tx = session.beginTransaction();
//				session.save(t1);
//				tx.commit();
//				session.close();
				
			out.println("<html><body>");
			out.println("<h1>Student Added <h1>");
			
		}
		//
		//else
//		{
//			out.println("<html><body>");
//			out.println("<h1>Student Cant be Added in Multiple Classes <h1>");
//		}
		
		doGet(request, response);
	}
	}



