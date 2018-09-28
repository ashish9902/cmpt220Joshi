package area;

import java.util.Scanner;

public class MyString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = in.nextLine();

		if (isPalindrome(s)) {
			System.out.println(s + " is a palindrome");
		} else {

			System.out.println(s + " is not a palindrome");
		}

	}

	public static String reverse(String s) {

		return new StringBuilder(s).reverse().toString();

	}

	public static boolean isPalindrome(String s) {
		String st = reverse(s);
		if (s.equals(st)) {
			return true;
		} else
			return false;
	}

}
