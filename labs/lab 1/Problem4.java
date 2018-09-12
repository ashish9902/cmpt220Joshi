package area;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class Problem4 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the mass:");
		double mass = input.nextDouble();
		double light = 299972458;
		double energy= mass*light; // JA: light squared
		System.out.println("The calculated energy is :" + energy+  " joules .");
	}

}
