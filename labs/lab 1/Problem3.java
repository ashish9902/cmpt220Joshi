package area;

	import java.util.Scanner;

	import java.io.*;
	import java.util.*;
	
	public class Problem3 {
		public static void main(String[] args) {
			
				  //1 gram = 0.035 273 962 ounce
				Scanner input= new Scanner(System.in);
				System.out.print("Enter a value for ounces :");
				double ounces = input.nextDouble();
				double grams = ounces*28.3495;
				System.out.println(ounces + " ounces is "+ grams);
				  
				
		}
	}


