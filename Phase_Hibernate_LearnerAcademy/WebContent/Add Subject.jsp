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

		<%@page import="com.simplilearn.util.HibernateUtil"%>

	
		
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Subject</h1>

	<form method="post" action="AddSubject">
		<fieldset>
		
			
			<legend>Enter the Subject Name </legend>
			Subject Name <input type="text" name="subjectname"/> <br/><br/> 
			<legend>Select the Teachers for the Subject </legend><br/> 
			

	<%
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session sessionnew = sf.openSession();
	String hql = "FROM Teacher";
	//Query query = 
List <Teacher> teacher = sessionnew.createQuery(hql).list();
for(Teacher teach: teacher) 
	
{
%>
	    
	
	<input type="checkbox" name="teacher"  value="<%=teach.getTeacherid()%>" />
	
	<%=teach.getTeacher_firstname()+" "+teach.getTeacher_lastname()%>
	  
	  
	
 <%--<option name="<%=teach.getTeacher_firstname()%>" value="<%=teach.getTeacher_firstname()+" "+teach.getTeacher_lastname()%> "><%=teach.getTeacher_firstname()+" "+teach.getTeacher_lastname()%></option>
    
    
    This is JSP comment --%>
    
    
  <br><br>
	
	
<% }%>
	
	  </select>
	  <br>
	  <br>
<input type="submit" value="Add Subject" />
			</fieldset>
	</form>
</body>
</html>