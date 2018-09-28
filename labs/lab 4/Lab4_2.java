package area;

import java.util.Arrays;
import java.util.Random;

public class Lab4_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[25];
		char[][] myArray = new char[5][5];
		int col = 5;
		int row = 5;
		for (int y = 0; y < row; y++) {
			for (int x = 0; x < col; x++) {
				char ch = (char) (rand.nextInt(26) + 'a');
				myArray[x][y] = ch;

			}
		}
		for (int y = 0; y < row; y++) {
			for (int x = 0; x < col; x++) {
				System.out.print(myArray[x][y] + " ");

			}
			System.out.println();
		}

	}

}
