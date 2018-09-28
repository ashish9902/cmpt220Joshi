package area;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a list of integers");
		// int num = in.nextInt();

		int index = 0;

		int[] arr = new int[100];

		int num = in.nextInt();
		while (num != 0) {
			arr[index] = num;
			num = in.nextInt();
			index++;

		}

		Arrays.sort(arr);

		for (int i = 0; i < 100; i++) {
			if (arr[i] != 0)
				System.out.println(arr[i]);

		}

	}

}
