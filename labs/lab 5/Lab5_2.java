package area;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers");
		double arr[] = new double[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextDouble();

		}

		double mean = mean(arr);
		System.out.println("The mean is " + mean);
		double sd = deviation(arr);
		System.out.println("The standard deviation is " + sd);

	}

	public static double deviation(double[] x) {
		double mean = mean(x);
		double length = x.length;
		double sumsd = 0;
		double dp = 0;
		double sd = 0;
		double df = length - 1;
		for (int j = 0; j < 10; j++) {
			double y = Math.pow(x[j] - mean, 2);
			sumsd += y;

		}
		dp = sumsd / df;
		return Math.sqrt(dp);

	}

	public static double mean(double[] x) {
		double length = x.length;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += x[i];
		}
		return sum / length;

	}

}
