package area;

import java.util.Scanner;
public class Problem04 {
	public static void main (String[] args) {
		String s;
		Scanner one= new Scanner(System.in);
			System.out.println("Enter first character");
			s=one.nextLine();
		char c = s.charAt(0);
		Scanner two=new Scanner(System.in);
		String sa;
		
			System.out.println( "Enter second character");
			sa=two.nextLine();
			char d= sa.charAt(0);
		
			System.out.println("Result is: " + (c+d));
		
		
		
		
	}

}
