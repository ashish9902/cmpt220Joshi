package area;

import java.util.TreeMap;
import java.util.Scanner;
import java.util.Random;

public class Problem03 {
	
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a lower limit integer");
		int number= input.nextInt();
		System.out.println("Enter an integer of higher value");
		int num=input.nextInt();
		
		Random rand= new Random();
		int low=number;
		int high=num;
		int count=1;
		Random randy= new Random();
		
		int randolph=randy.nextInt(num-number)+low;
		Random rando= new Random();
		int ra=rando.nextInt(num-number)+low+1;
		
		int randomNum=rand.nextInt(num-number)+low;
		for (int i=0; i<count;i++) {
			//if (randomNum==randolph)
				System.out.println(randomNum);
			System.out.println(randolph);
			System.out.println(ra);
			
		}
	
		
		
		
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	        
	        
		

	}
}
			
		
	
		
	
	




