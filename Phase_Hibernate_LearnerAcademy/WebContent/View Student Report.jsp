<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="handle-error.jsp" %>
	
	<%@page import="java.nio.channels.SeekableByteChannel"%>
	<%@page import="java.io.IOException"%>
	<%@page import="java.io.PrintWriter"%>
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>
	<%@page import="javax.servlet.ServletException"%>
	<%@page import="javax.servlet.annotation.WebServlet"%>
	<%@page import="javax.servlet.http.HttpServlet"%>
	<%@page import="javax.servlet.http.HttpServletRequest"%>
	<%@page import="javax.servlet.http.HttpServletResponse"%>
	<%@page import="org.hibernate.Session"%>
		<%@page import="org.hibernate.SessionFactory"%>
		<%@page import="org.hibernate.Transaction"%>
		<%@page import="com.simplilearn.entity.Classess"%>
		<%@page import="com.simplilearn.entity.Student"%>
		<%@page import="com.simplilearn.entity.Subject"%>
		<%@page import="com.simplilearn.entity.Teacher"%>
		<%@page import="com.simplilearn.util.HibernateUtil"%>
	
	
	




	<%
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session sessionnew = sf.openSession();
	
	%>
	
	
	<h1> Class Report With Student :-</h1>
	<style> table,td,th { border:2px solid green; padding:10px; } </style>
	<table>
	<tr>
	
	
	<th> Class ID </th>
	<th> Class Name </th>
	<th> Student Id </th>
	<th> Student First Name </th>
	<th> Student Last Name </th>
	<th> Student Address </th>
	
	<th> Subject  ID </th>
	<th> Subject Name </th>
	<th> Teacher ID </th>
	<th> Teacher First Name </th>
	<th> Teacher Last Name  </th>
	
	
	
	</tr>
	<%
	try{
// 		Teacher t1= new Teacher();
// 		Teacher t2= new Teacher();
// 		Teacher t3= new Teacher();
// 		Teacher t4= new Teacher();
		
// 		//t1.setTeacherid(11);
		
// 		//t1.setSubject_name("Physics");
// 		t1.setTeacher_firstname("Ruchi");
// 		t1.setTeacher_lastname("Bhel");
		
// 		//t2.setTeacherid(12);
// 		//t2.setSubject_name("Chemistry");
// 		t2.setTeacher_firstname("S K");
// 		t2.setTeacher_lastname("Verma");
	
// 		//t3.setTeacherid(13);
// 		//t3.setSubject_name("Maths");
// 		t3.setTeacher_firstname("Dilbag");
// 		t3.setTeacher_lastname(" Singh ");
		
// 		//t4.setSubject_name("Computers ");
// 		t4.setTeacher_firstname(" Puroshatam ");
// 		t4.setTeacher_lastname(" Singh ");
			
	
		
// 		List <Teacher> listteacher1 = new ArrayList<Teacher>();
// 		List <Teacher> listteacher2 = new ArrayList<Teacher>();
// 		List <Teacher> listteacher3 = new ArrayList<Teacher>();
		
// 		listteacher1.add(t1);
// 		listteacher2.add(t2);
// 		listteacher3.add(t3);
// 		listteacher3.add(t4);
// 		Subject s1= new Subject();
// 		Subject s2= new Subject();
// 		Subject s3= new Subject();
// 		Subject s4= new Subject();
		

// 		s1.setSubjectname("Physics ");
// 		s1.setTeacher(listteacher1);
		
// 		s2.setSubjectname("Chemitry ");
// 		s2.setTeacher(listteacher2);
		
// 		s3.setSubjectname("Math ");
// 		s3.setTeacher(listteacher3);
		
// 		s4.setSubjectname("English ");
// 		s4.setTeacher(listteacher1);
		
// 		List <Subject> subject1 = new ArrayList<Subject>();
// 		List <Subject> subject2 = new ArrayList<Subject>();
// 		List <Subject> subject3 = new ArrayList<Subject>();
		
// 		subject1.add(s1);
// 		subject2.add(s2);
// 		subject2.add(s3);
// 		subject3.add(s4);
		
		

// 		Classess c1=new Classess();
// 		Classess c2= new Classess();
// 		Classess c3= new Classess();
	
// 		c1.setClassname("12 A");
// 		c1.setSubject(subject1);
		
		
// 		c2.setClassname("12 B");
// 		c2.setSubject(subject2);

		
// 		//c3.setClass_id(3);
// 		c3.setClassname("12 C");
// 		c3.setSubject(subject3);
		
		
// 		Student stu1=new Student();
// 		Student stu2=new Student();
// 		Student stu3=new Student();
// 		Student stu4=new Student();
		
// 	//	stu1.setStudent_id(1);
// 		stu1.setFname("Abhimanyu");
// 		stu1.setLname("Wazir");
// 		stu1.setAddress("Paloura Top Jammu");
// 		stu1.setClasses(c1);
		
// 	//	stu2.setStudent_id(2);
// 		stu2.setFname("Sanya");
// 		stu2.setLname("Arora");
// 		stu2.setAddress("Delhi");
// 		stu2.setClasses(c2);
		
// 		//stu3.setStudent_id(3);
// 		stu3.setFname("Mayank");
// 		stu3.setLname("Purohit");
// 		stu3.setAddress("Faridabad");
// 		stu3.setClasses(c1);
		
// 	//	stu4.setStudent_id(4);
// 		stu4.setFname("Abhishek");
// 		stu4.setLname("Gupta");
// 		stu4.setAddress("New Delhi");
// 		stu4.setClasses(c3);
		
		

// 		List <Student> student = new ArrayList<Student>();
// 		student.add(stu1);
		
// 		List <Student> student1 = new ArrayList<Student>();
// 		List <Student> student2 = new ArrayList<Student>();
// 		student1.add(stu2);
// 		student1.add(stu3);
// 		student2.add(stu4);
		
		
		
		

// 		Transaction tx = sessionnew.beginTransaction();
// 		sessionnew.save(t1);
// 		sessionnew.save(t2);
// 		sessionnew.save(t3);
// 		sessionnew.save(t4);
// 		tx.commit();
		
// 		tx = sessionnew.beginTransaction();
// 		sessionnew.save(s1);
// 		sessionnew.save(s2);
// 		sessionnew.save(s3);
// 		sessionnew.save(s4);
// 		tx.commit();
		
// 		tx = sessionnew.beginTransaction();
// 		sessionnew.save(c1);
// 		sessionnew.save(c2);
// 		sessionnew.save(c3);
// 		tx.commit();
// 		tx = sessionnew.beginTransaction();
// 		sessionnew.save(stu1);
// 		sessionnew.save(stu2);
// 		sessionnew.save(stu3);
// 		sessionnew.save(stu4);
// 		tx.commit();
		
		String hql = "FROM Student  ORDER BY classes_class_id";
		//Query query = 
	List<Student> students = sessionnew.createQuery(hql).list();
	
	for(Student stud: students) 
	{
		Classess calss =stud.getClasses();
		List <Subject> subject=calss.getSubject();
	
	%>
		
		<tr>
		
		
		
		
		
		<td><%=calss.getClass_id()%></td>
		<td><%=calss.getClassname()%></td>
		<td><%=stud.getStudent_id()%></td>
		<td><%=stud.getFname()%></td>
		<td><%=stud.getLname()%></td>
		<td><%=stud.getAddress()%></td>
	
	<%	
		 int count =0;	
		for(Subject sub: subject) 
		{
			
			if(count>=1)
			{
			
			%>
				<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
		
				
				<%	}%>
				
			<td><%=sub.getSubject_id()%></td>
			<td><%=sub.getSubjectname()%></td>
		<%		
//			if(count>=1)
//			{
//				</tr>
//				
//			}
			List <Teacher>teacherlist=sub.getTeacher();
			
			int count1=0;
			for(Teacher teach:teacherlist)
			{
				
				if(count1>=1)
				{
				%>
					
					<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><%=sub.getSubject_id()%></td>
					<td><%=sub.getSubjectname()%></td>
			
			<%} %>	
				<td><%=teach.getTeacherid()%></td>
				<td><%=teach.getTeacher_firstname()%></td>
				<td><%=teach.getTeacher_lastname()%></td>
				
				<%
				
				if(count1>=1)
				{
					//</tr>
					
				}
				count1++;
		
			}
			count ++;
		}
	}
		%>
		</tr>
	
	
	
	</table></body></html>
<%	sessionnew.close();

}
	

catch(Exception e)
	{
	
	}

%>
	</body></html>
	
	
	
	
	
	





</body>
</html>