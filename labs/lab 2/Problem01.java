package area;
import java.util.Scanner;

public class Problem01 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		double number= input.nextDouble();
		System.out.println("Enter another integer");
		double num=input.nextDouble();
		if (number < num) {
			System.out.println(number<num);
			System.out.println(number + "is less than "+ num );
		} if (number<=num) {
			 System.out.println(number<=num);
			System.out.println(number + "is less than or equal to "+ num);
		 
		}if (number==num) {
			System.out.println(number==num);
			System.out.println(number + " equal to  "+ num);
		
		}if (number!=num) {
			System.out.println(number!=num);
			System.out.println(number + "is not equal to than "+ num);
		
		}if (number>num) {
			System.out.println(number>num);
				System.out.println(number + "is greater than "+ num);
		
		} if  (number >= num) {
			 System.out.println(number>=num);
					System.out.println(number + "is greater than or equal to "+ num );
					
					
					
		

		 
		 
		
		
		}
	}
}
		
		
		
		
		
	

