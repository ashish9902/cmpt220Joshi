package area;

import java.util.Arrays;
public class CourseDriver {
	public static void main (String[] args) {
		Course course = new Course("Intro to Java :)");

        // adding 3 students
        //for (int i = 0; i < 3; i++) {
            	course.addStudent("Tom");
            	course.addStudent("Dick");
            	course.addStudent("Harry");
        	//course.addStudent("Student " + (i + 1));
        //}

        // Displaying course name and student taking the course.
        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-12s ", students[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }

        }
        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("Dropping one student from the class");
        System.out.println("Dick dropped the class");
        course.dropStudent("Dick");
        

        System.out.println("Displaying students...\n");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%-12s ", students[i]);

            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("\nNumber of students: " + course.getNumberOfStudents());

    }

	
	}

