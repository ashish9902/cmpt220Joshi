package area;

import java.util.Arrays;

public class Lab_6 {
	public static void main(String[] args) {
		int[] arr = new int[12];
		arr[0] = -1;
		for (int i = 0; i <= 10; i++) {
			addAtEnd(arr, i);
		}

		System.out.println(Arrays.toString(arr));
		insertValueAtLoc(arr, 3, 10);
		insertValueAtLoc(arr, 7, 100);
		System.out.println(Arrays.toString(arr));

	}

	public static void addAtEnd(int[] arr, int value) {

		int index = 0;
		while (arr[index] != -1) {
			index++;

		}

		arr[index + 1] = -1;
		arr[index] = value;
	}

	public static void insertValueAtLoc(int[] arr, int index, int value) {
		arr[index] = value;
	}

}
