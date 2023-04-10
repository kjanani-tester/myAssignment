package org.college;

public class Student extends Department {
	
	public void studentName(String name) {
		
		System.out.println("The Student Name is "+name);
	}
	public void studentDept(String dept) {
		System.out.println("The Student department is "+dept);
	}
	
	public int studentID(int id) {
		//System.out.println("The Student ID is "+id);
		return id;
	}
	
	
	public static void main(String[] args) {
		Student sd=new Student();
		sd.collegeCode();
		sd.collegeName();
		sd.collegeRank();
		sd.deptName();
		sd.studentDept("Computer Science");
		System.out.println("The student ID is " + sd.studentID(6));
		sd.studentName("Thishiyan");
	}

}
