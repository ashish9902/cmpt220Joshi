package area;

import java.util.Random;

public class Lab4_5 {
	public static void main(String[] args) {
		Random rand = new Random();
		int high = 0;
		int low = 0;

		double sum = 0;
		int average;
		int[] value = new int[1000];
		for (int i = 1; i < 1000; i++) {
			int num = rand.nextInt(100) * 10;
			value[i] = num;

			sum = sum + num;

		}
		double ave = sum / 1000;

		System.out.println("The average is " + ave);

		for (int j = 0; j < value.length; j++) {
			if (value[j] > ave) {
				high++;

			} else if (value[j] < ave) {
				low++;

			}
		}
		System.out.println("Numbers are above the average are " + high);
		System.out.println("Numbers are below the average are " + low);

	}

}
