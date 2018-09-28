package area;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Lab4_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = input.nextLine();
		s = s.toLowerCase();

		int len = s.length();

		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {

			char charAt = s.charAt(i);
			if ((int) charAt > 96 && (int) charAt < 123) {
				count[((int) charAt) - 97]++;
			}

		}

		for (int j = 0; j < count.length; j++) {
			if (count[j] > 0)
				System.out.println("Number of " + (char) (j + 97) + " count is " + count[j]);

		}

	}

}
