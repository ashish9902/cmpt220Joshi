package area;

import java.util.Scanner;
public class Problem05 {
	public static void main(String [] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter a string");
		String s= ip.nextLine();
		System.out.println("Enter another string");
		String st=ip.nextLine();
		if (s.compareTo(st)<0) {
			System.out.println(s + " comes before "+ st);
		}
		else if (s.compareTo(st)==0) {
			System.out.println("Both "+ s +" and " + st + " are the same ") ;
		}
		else if (s.compareTo(st)>0) {
			System.out.println(st+ " comes before "+ s);
		}
		
		
	
		
		
	}
	

}
