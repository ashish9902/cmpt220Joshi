package area;


import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	
	private String courseName;
	private int numOfstudent;
	ArrayList<String> students = new ArrayList<String>();
	  
	Course(String coursename)
	{
	this.courseName=coursename;
	numOfstudent=0;
	}
	public void addStudent(String student)
	{
	students.add(student);
	numOfstudent++;
	}


	public ArrayList<String> getStudents() {
		return students;
	}

	public int getnumOfstudent() {
		return numOfstudent;
	}

	public String getcourseName() {
		return courseName;
	}

	public static void main(String[] args) {
		Course students = new Course("Differential Equations");
		students.addStudent("Tom");
		students.addStudent("Dick");
		students.addStudent("Harry");
		System.out.println(students.getStudents());
		System.out.println(students.getnumOfstudent());
		System.out.println(students.getcourseName());

	}
}
	
	
	
	
	
 