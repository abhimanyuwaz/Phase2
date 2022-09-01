package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import com.simplilearn.entity.Subject;
import com.simplilearn.entity.Teacher;
import com.simplilearn.util.HibernateUtil;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/add-student-test")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
//		PrintWriter out = response.getWriter();
//		out.append("<html>Wencole to Setvlet<body>");
//		out.println("successfully");
//		out.append("</html></body>");
//		Student stu1=new Student();
//		Student stu2=new Student();
//		Student stu3=new Student();
//		Student stu4=new Student();
//		
//		stu1.setStudent_id(1);
//		stu1.setFname("Abhimanyu");
//		stu1.setLname("Wazir");
//		stu1.setAddress("Paloura Top Jammu");
//		
//		stu2.setStudent_id(2);
//		stu2.setFname("Sanya");
//		stu2.setLname("Arora");
//		stu2.setAddress("Delhi");
//		
//		stu3.setStudent_id(3);
//		stu3.setFname("Mayank");
//		stu3.setLname("Purohit");
//		stu3.setAddress("Faridabad");
//		
//		stu4.setStudent_id(4);
//		stu4.setFname("Abhishek");
//		stu4.setLname("Gupta");
//		stu4.setAddress("New Delhi");
//		
//		
//		
//		//List<PhoneNumber> phones = new ArrayList<>();
//	
//		List <Student> student = new ArrayList<Student>();
//		student.add(stu1);
//		
//		List <Student> student1 = new ArrayList<Student>();
//		List <Student> student2 = new ArrayList<Student>();
//		student1.add(stu2);
//		student1.add(stu3);
//		
//		student2.add(stu4);
//		
//		StudentClasses c1=new StudentClasses();
//		StudentClasses c2= new StudentClasses();
//		StudentClasses c3= new StudentClasses();
//		//Classes c4= new Classes();
//		
//		c1.setClass_id(1);
//		c1.setClassname("12 A");
//		c1.setSubject(" Physics");
//		c1.setStu(student);
//		
//		c2.setClass_id(2);
//		c2.setClassname("12 B");
//		c2.setSubject(" Chemistry");
//		c2.setStu(student1);
//		
//		c3.setClass_id(3);
//		c3.setClassname("12 C");
//		c3.setSubject(" Math");
//		c3.setStu(student2);
////		
////		c2.setClass_id("C3");
////		c2.setClassname("12 A");
////		c2.setSubject(" English");
//		
//		
//		Teacher t1= new Teacher();
//		Teacher t2= new Teacher();
//	
//		
//			
//		
//		List <StudentClasses> classlist= new ArrayList<StudentClasses>();
//		List <StudentClasses> classlist1= new ArrayList<StudentClasses>();
//		
//		classlist.add(c1);
//		classlist.add(c2);
//		classlist1.add(c3);
//		
//		t1.setTeacherid(11);
//		t1.setSubject_name("Physics");
//		t1.setTeacher_firstname("Ruchi");
//		t1.setTeacher_lastname("Bhel");
//		t1.setCls(classlist);
//		
//		
//		
//		t2.setTeacherid(12);
//		t2.setSubject_name("Chemistry");
//		t2.setTeacher_firstname("S K");
//		t2.setTeacher_lastname("Verma");
//	
//		t1.setCls(classlist1);
//		
////		t3.setSubject_name("Mahs");
////		t3.setTeacher_firstname("Dilbag");
////		t3.setTeacher_lastname("Singh");
////		t3.setTeacherid("TID3");
//		
//		
//		
//		
////		t3.setSubject_name("Maths");
////		t3.setTeacher_firstname("Dilbag");
////		t3.setTeacher_lastname("Singh");
////		
////		t4.setSubject_name("Englisg");
////		t4.setTeacher_firstname("Sunita");
////		t4.setTeacher_lastname("Grover");
//
//			Subject s1= new Subject();
//			Subject s2= new Subject();
//					Subject s3= new Subject();
//			
//			
//			s1.setSubject_id(1);
//			s1.setSubjectname("Physics ");
//			s1.setCls(c1);
//	
//		
//
//			s1.setSubject_id(2);
//			s1.setSubjectname("Chemitry ");
//			s1.setCls(c2);
//			
//			s1.setSubject_id(3);
//			s1.setSubjectname("Math ");
//			s1.setCls(c3);
//
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		Session session = sf.openSession();
//
//		Transaction tx = session.beginTransaction();
//		session.save(c1);
//		
//		session.save(c2);
//		session.save(c3);
//		tx.commit();
//	
//		tx = session.beginTransaction();
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		tx.commit();
//		tx = session.beginTransaction();
//		session.save(t1);
//		session.save(t2);
//		
//		tx.commit();
//		session.close();
//		
//		doPost(request, response);
		//request.getRequestDispatcher("add-student.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.append("<html>t<body>");
//		out.println("successfully");
		out.append("</html></body>");

		Teacher t1= new Teacher();
		Teacher t2= new Teacher();
		Teacher t3= new Teacher();
		Teacher t4= new Teacher();
		
		//t1.setTeacherid(11);
		
		//t1.setSubject_name("Physics");
		t1.setTeacher_firstname("Ruchi");
		t1.setTeacher_lastname("Bhel");
		
		//t2.setTeacherid(12);
		//t2.setSubject_name("Chemistry");
		t2.setTeacher_firstname("S K");
		t2.setTeacher_lastname("Verma");
	
		//t3.setTeacherid(13);
		//t3.setSubject_name("Maths");
		t3.setTeacher_firstname("Dilbag");
		t3.setTeacher_lastname(" Singh ");
		
		//t4.setSubject_name("Computers ");
		t4.setTeacher_firstname(" Puroshatam ");
		t4.setTeacher_lastname(" Singh ");
			
	
		
		List <Teacher> listteacher1 = new ArrayList<Teacher>();
		List <Teacher> listteacher2 = new ArrayList<Teacher>();
		List <Teacher> listteacher3 = new ArrayList<Teacher>();
		
		listteacher1.add(t1);
		listteacher2.add(t2);
		listteacher3.add(t3);
		listteacher3.add(t4);
		Subject s1= new Subject();
		Subject s2= new Subject();
		Subject s3= new Subject();
		Subject s4= new Subject();
		

		s1.setSubjectname("Physics ");
		s1.setTeacher(listteacher1);
		
		s2.setSubjectname("Chemitry ");
		s2.setTeacher(listteacher2);
		
		s3.setSubjectname("Math ");
		s3.setTeacher(listteacher3);
		
		s4.setSubjectname("English ");
		s4.setTeacher(listteacher1);
		
		List <Subject> subject1 = new ArrayList<Subject>();
		List <Subject> subject2 = new ArrayList<Subject>();
		List <Subject> subject3 = new ArrayList<Subject>();
		
		subject1.add(s1);
		subject2.add(s2);
		subject2.add(s3);
		subject3.add(s4);
		
		

		Classess c1=new Classess();
		Classess c2= new Classess();
		Classess c3= new Classess();
	
		c1.setClassname("12 A");
		c1.setSubject(subject1);
		
		
		c2.setClassname("12 B");
		c2.setSubject(subject2);

		
		//c3.setClass_id(3);
		c3.setClassname("12 C");
		c3.setSubject(subject3);
		
		
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();
		Student stu4=new Student();
		
	//	stu1.setStudent_id(1);
		stu1.setFname("Abhimanyu");
		stu1.setLname("Wazir");
		stu1.setAddress("Paloura Top Jammu");
		stu1.setClasses(c1);
		
	//	stu2.setStudent_id(2);
		stu2.setFname("Sanya");
		stu2.setLname("Arora");
		stu2.setAddress("Delhi");
		stu2.setClasses(c2);
		
		//stu3.setStudent_id(3);
		stu3.setFname("Mayank");
		stu3.setLname("Purohit");
		stu3.setAddress("Faridabad");
		stu3.setClasses(c1);
		
	//	stu4.setStudent_id(4);
		stu4.setFname("Abhishek");
		stu4.setLname("Gupta");
		stu4.setAddress("New Delhi");
		stu4.setClasses(c3);
		
		

		List <Student> student = new ArrayList<Student>();
		student.add(stu1);
		
		List <Student> student1 = new ArrayList<Student>();
		List <Student> student2 = new ArrayList<Student>();
		student1.add(stu2);
		student1.add(stu3);
		student2.add(stu4);
		
		
		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		tx.commit();
		
		tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		tx.commit();
		
		tx = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		tx.commit();
		tx = session.beginTransaction();
		session.save(stu1);
		session.save(stu2);
		session.save(stu3);
		session.save(stu4);
		tx.commit();

		out.println("<h1>Student List :-</h1>");
		out.println("<style> table,td,th { border:2px solid green; padding:10px; } </style>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th> Student Id </th>");
		out.println("<th> Student First Name </th>");
		out.println("<th> Student Last Name </th>");
		out.println("<th> Student Address </th>");
		
		
		out.println("<th> Class ID </th>");
		out.println("<th> Class Name </th>");
		
		out.println("<th> Subject  ID </th>");
		out.println("<th> Subject Name </th>");
		out.println("<th> Teacher ID </th>");
		out.println("<th> Teacher First Name </th>");
		out.println("<th> Teacher Last Name  </th>");
		
		
		
		out.println("</tr>");
		
		List<Student> students = session.createQuery("from Student").list();
		for(Student stud: students) 
		{
			
			out.println("<tr>");
			out.println("<td>"+stud.getStudent_id()+"</td>");
			out.println("<td>"+stud.getFname()+"</td>");
			out.println("<td>"+stud.getLname()+"</td>");
			out.println("<td>"+stud.getAddress()+"</td>");
			
			
			
			Classess calss =stud.getClasses();
			out.println("<td>"+calss.getClass_id()+"</td>");
			out.println("<td>"+calss.getClassname()+"</td>");
		
			List <Subject> subject=calss.getSubject();
			 int count =0;	
			for(Subject sub: subject) 
			{
				
				if(count>=1)
				{
					out.println("<tr>");
					out.println("<td></td>");
					out.println("<td></td>");
					out.println("<td></td>");
					out.println("<td></td>");
					out.println("<td></td>");
					out.println("<td></td>");
			
					
				}
				out.println("<td>"+sub.getSubject_id()+"</td>");
				out.println("<td>"+sub.getSubjectname()+"</td>");
					
//				if(count>=1)
//				{
//					out.println("</tr>");
//					
//				}
				List <Teacher>teacherlist=sub.getTeacher();
				
				int count1=0;
				for(Teacher teach:teacherlist)
				{
					
					if(count1>=1)
					{
						
						out.println("<tr>");
						out.println("<td></td>");
						out.println("<td></td>");
						out.println("<td></td>");
						out.println("<td></td>");
						out.println("<td></td>");
						out.println("<td></td>");
						out.println("<td>"+sub.getSubject_id()+"</td>");
						out.println("<td>"+sub.getSubjectname()+"</td>");
				
					}
					out.println("<td>"+teach.getTeacherid()+"</td>");
					out.println("<td>"+teach.getTeacher_firstname()+"</td>");
					out.println("<td>"+teach.getTeacher_lastname()+"</td>");
					if(count1>=1)
					{
						//out.println("</tr>");
						
					}
					count1++;
			
				}
				count ++;
			}
			out.println("</tr>");
		
		}
		
		out.println("</table></body></html>");
		session.close();
		out.println("</body></html>");
		
//		
//	
//			
		
		

        session.close();
		
		
		
//		Student student = populateStudent(request);
//
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		Session session = sf.openSession();
//
//		Transaction tx = session.beginTransaction();
//		session.save(student);
//
//		tx.commit();
//		session.close();
//
//		PrintWriter out = response.getWriter();
//		out.append("<html><body>");
//		out.println("Records saved successfully");
//		out.append("</html></body>");
		
		

	}

//	private Student populateStudent(HttpServletRequest request) {
//		String fname = request.getParameter("fname");
//		String lname = request.getParameter("lname");
//
//		Student student = new Student();
//
//		// Phone1
//		String phoneNum1 = request.getParameter("phone_1");
//		String phoneType1 = request.getParameter("types1");
//		PhoneNumber phoneNumber1 = new PhoneNumber();
//		phoneNumber1.setPhoneNumber(phoneNum1);
//		phoneNumber1.setPhoneType(phoneType1);
//		phoneNumber1.setStudent(student);
//
//		// Phone2
//		String phoneNum2 = request.getParameter("phone_2");
//		String phoneType2 = request.getParameter("types2");
//		PhoneNumber phoneNumber2 = new PhoneNumber();
//		phoneNumber2.setPhoneNumber(phoneNum2);
//		phoneNumber2.setPhoneType(phoneType2);
//		phoneNumber2.setStudent(student);
//
//		// Phone3
//		String phoneNum3 = request.getParameter("phone_3");
//		String phoneType3 = request.getParameter("types3");
//		PhoneNumber phoneNumber3 = new PhoneNumber();
//		phoneNumber3.setPhoneNumber(phoneNum3);
//		phoneNumber3.setPhoneType(phoneType3);
//		phoneNumber3.setStudent(student);
//
//		List<PhoneNumber> phones = new ArrayList<>();
//		phones.add(phoneNumber1);
//		phones.add(phoneNumber2);
//		phones.add(phoneNumber3);
//
//		student.setFname(fname);
//		student.setLname(lname);
//		student.setPhones(phones);
//
//		List<Student> students = new ArrayList<>();
//		students.add(student);
//
//		// Add details for courses
//
//		// Read Course1
//		String courseName1 = request.getParameter("course_1");
//		String courseType1 = request.getParameter("course_type_1");
//
//		Course course1 = new Course();
//		course1.setCourseName(courseName1);
//		course1.setCourseType(courseType1);
//		course1.setStudents(students);
//
//		// Read Course2
//		String courseName2 = request.getParameter("course_2");
//		String courseType2 = request.getParameter("course_type_2");
//
//		Course course2 = new Course();
//		course2.setCourseName(courseName2);
//		course2.setCourseType(courseType2);
//		course2.setStudents(students);
//
//		// Read Course3
//		String courseName3 = request.getParameter("course_3");
//		String courseType3 = request.getParameter("course_type_3");
//
//		Course course3 = new Course();
//		course3.setCourseName(courseName3);
//		course3.setCourseType(courseType3);
//		course2.setStudents(students);
//
//		List<Course> courses = new ArrayList<>();
//		courses.add(course1);
//		courses.add(course2);
//		courses.add(course3);
//
//		student.setCourse(courses);
//		
//		// Populate address object
//		
//		String street = request.getParameter("street");
//		String city = request.getParameter("city");
//		String state = request.getParameter("state");
//		
//		Address addr = new Address();
//		addr.setState(state);
//		addr.setCity(city);
//		addr.setStreet(street);
//		
//		student.setAddress(addr);
//		
//		return student;
//	}

}
