package area;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_5 {
	public static void main(String[] args) {
		int numbers[] = new int[9];
		int matrix[][];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = input.nextInt();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of columns");
		int col = in.nextInt();
		matrix = new int[row][col];
		System.out.println("Enter the data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = in.nextInt();

			}
		}
		System.out.println("The transpose of the matrix");
		for (int y = 0; y < row; y++) {
			for (int x = 0; x < col; x++) {
				System.out.print(matrix[y][x] + " ");

			}

			System.out.println();

		}

		System.out.println("is");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {

				System.out.print(matrix[j][i] + " ");

			}
			System.out.println(" ");

		}
	}

}
