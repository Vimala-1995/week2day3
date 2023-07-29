package org.student;
import org.department.Department;
public class student extends Department{
	public void studentName() {
	System.out.println("the student name");
}

		public void studentDept() 
		{
			System.out.println("The student department");
		}
		public void StudentId()
		{
			System.out.println("The student id");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student details=new student();
		details.studentDept();
		details.studentName();
		details.StudentId();
		details.departmentname();
		details.collegecode();
		details.collegeName();
		details.collegeRank();
		
	}

}
