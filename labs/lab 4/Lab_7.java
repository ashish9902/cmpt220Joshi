package area;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a list of integers");

		int[] arr = new int[10];
		int arr1[];
		boolean repeat = false;
		int l = arr.length;
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();

		}

		for (int j = 0; j < l; j++) {

			for (int k = j + 1; k < l; k++) {
				if (arr[k] == arr[j]) {
					int value = k;

					for (int v = k + 1; v < l; v++) {

						arr[value] = arr[v];
						value++;

					}
					l--;
					j--;

				}

			}

		}
		int[] arr2 = new int[l];
		for (int c = 0; c < l; c++) {
			arr2[c] = arr[c];
		}
		System.out.println(Arrays.toString(arr2));

	}

}
