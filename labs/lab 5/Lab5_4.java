package area;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_4 {
	public static void main(String[] args) {
		int x[] = new int[5];
		int y[] = new int[5];

		boolean equal = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first array");
		for (int i = 0; i < 5; i++) {
			x[i] = input.nextInt();

		}
		Scanner second = new Scanner(System.in);
		System.out.println("Enter the second array");
		for (int j = 0; j < 5; j++) {
			y[j] = second.nextInt();

		}
		boolean value = equal(x, y);
		if (value) {
			System.out.println("The two arrays are identical ");
		} else {
			System.out.println("The two arrays are not identical");

		}

	}

	public static boolean equal(int[] x, int []y ) {
		Arrays.sort(x);
		Arrays.sort(y);
		
		for(int i = 0; i < 5; i++) {
			if(x[i] != y[i]) {
				return false;
			}
		}
		return true;
	
	}
		
}
