package area;

import java.util.Scanner;

public class LoopsProblem1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number the input ends with 0");

		int number;
		int sum = 0;
		int counter = 0;
		int average;

		do {
			number = input.nextInt();
			sum += number;

			if (number % 2 == 0)
				counter = counter + 1;
			if (number == 0) {
				counter = counter - 1;
			}

		} while (number != 0);
		System.out.println("The number of even numbers is " + counter);
		System.out.println("The sum of the number is " + sum);
		System.out.println("The average of the number is " + (sum / counter));

	}

}
