package area;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Lab5_3 {
	public static void main (String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

        input.useDelimiter(System.getProperty("line.separator"));

        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();
        
        Student[] students = new Student[numofstudents]; 

        for(int i = 0; i < numofstudents; i++) {
            System.out.print("Enter the student's name: ");
           
            String student = input.next(); 

            System.out.print("Enter the student's score: ");
     
            Double grade = (Double) input.nextDouble(); 

            students[i] = new Student(student, grade); 
        }
        System.out.print("Name" + "\tScore");
        System.out.print("\n----" + "\t----\n");
      

        Arrays.sort(students, new Comparator<Student>() {

          @Override
          public int compare(Student entry1, Student entry2) {
            return entry2.grade.compareTo(entry1.grade); 
          }
        });

       
        for (int i = 0; i < students.length; i++){
          System.out.println(students[i].student + "\t" + students[i].grade);
        }

    }
 
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


	
