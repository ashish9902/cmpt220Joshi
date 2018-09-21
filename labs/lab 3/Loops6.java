package area;

import java.util.Scanner;

public class Loops6 {
	public static void main(String[] args) {
		Scanner character = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = character.nextLine();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char x = word.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				count++;

			}

		}

		System.out.println(count);

	}

}
