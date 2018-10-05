package area;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter 10 numbers");

		double array[] = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		double num = max(array);
		System.out.println(num);

	}

	public static double max(double[] array) {

		Arrays.sort(array);
		return array[array.length - 1];

	}

}
