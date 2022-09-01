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

	<h1>Add Student</h1>

	<form method="post" action="add-student">
		<fieldset>
		
			First Name:<input type="text" name="fname"/> <br/><br/> 
			Last Name:<input type="text" name="lname"/> <br/><br/> 
			Address :<input type="text" name="address"/> <br/><br/> 
			
			<legend>Select the Class for the Student </legend>
			
		
			
  			
			
	<%
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session sessionnew = sf.openSession();
	String hql = "FROM Classess";
	//Query query = 
List <Classess> classess = sessionnew.createQuery(hql).list();
for(Classess cls: classess) 

	
{
%>
<br>
<input type="checkbox" name="class" value="<%=cls.getClass_id()%>" /><%=cls.getClassname()%>	
<br>

<!--  <input type="radio" id="<%=cls.getClass_id()%>" name="fav_language" value="HTML">
<label for="html"><%=cls.getClassname()%></label><br>
  	-->
	
<% 
}


sessionnew.close();
%>
	
	  </select>
	  <br>
	  <br>

			</fieldset>
			<br>
			
			<input type="submit" value="Add Student" />
			
	</form>
</body>
</html>