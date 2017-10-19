package com.cs.test;

import com.cs.delegate.UniversityDelegate;
import com.cs.entity.College;
import com.cs.entity.Student;

public class CSTest1 {
	public static void main(String[] args) {
		College college=new College();
		college.setCollegeName("NECG");
		college.setAddress("gudur");
		Student student=new Student();
		student.setStudentName("thirupal");
		student.setContactNo("4587215");
		student.setMail("thiru@gmail.com");
		UniversityDelegate delegate=new UniversityDelegate();
		int collegeNo=delegate.createCollege(student, college);
		System.out.println(collegeNo);
		
	}
	
}
