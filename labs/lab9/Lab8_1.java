package area;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Lab8_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the index of the array");
		int[] myArr = new int[100];

		int rand = (int) (Math.random() * 10);
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = (int) (Math.random() * 10);

		}
		

		try {

			System.out.println("The corresponding element value is " + myArr[in.nextInt()]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	public static int[] getArr() {
		int[] myArr = new int[100];

		int rand = (int) (Math.random() * 10);
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = (int) (Math.random() * 10);

		}
		return myArr;

	}

}
