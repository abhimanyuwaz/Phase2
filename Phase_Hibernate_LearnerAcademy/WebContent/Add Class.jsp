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
	<%@page import="java.util.ArrayList"%>
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

	<h1>Add Class</h1>

	<form method="post" action="add-class">
		<fieldset>
		
			Class Name:<input type="text" name="classname"/> <br/><br/> 
			
			<legend>Select the Subject for the Class </legend>
			
			
	<%
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session sessionnew = sf.openSession();
	String hql = "FROM Subject";
	//Query query = 
List <Subject> subject = sessionnew.createQuery(hql).list();
for(Subject sub: subject) 
	
{
%>
	
    <%---<option name="<%=sub.getSubject_id()%>" value="<%=sub.getSubjectname()%>"><%=sub.getSubjectname()%></option>
    --%>
    
<br>
<input type="checkbox" name="subject" value="<%=sub.getSubject_id()%>" /><%=sub.getSubjectname()%>	
<br>
	
	
<% }%>
	
	  </select>
	  <br>
	  <br>

			</fieldset>
			<br>
			
			<input type="submit" value="Add Class" />
			
	</form>
</body>
</html>