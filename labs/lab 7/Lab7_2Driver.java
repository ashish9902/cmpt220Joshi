package area;

import java.util.Arrays;
import java.util.Scanner;

public class Lab7_2Driver {
	public static void main (String[] args) {
		Lab7_2 obj= new Lab7_2();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number");
		int value= in.nextInt();
		boolean apple= false;
		while(value>1) {
			for (int i=2;i<value/2;i++) {
				if (value%i==0) {
					apple=true;
					obj.push(i);
					value=value/i;
					break;
				}	
			}
			 if (apple==false) {
				obj.push(value);
				value=0;
			 }
			 apple=false;
		}
		for (int i=obj.size-1;i>=0;i--) {
			System.out.print(obj.elements[i]+ " ");
		}
		
	}
	
}
