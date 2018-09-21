package area;

import java.util.ArrayList;

public class Loops4 {
	public static void main(String[] args) {

//		int x=0;

		int[] values = new int[15000];
		int largest = values[0];
		for (int i = 1; i < 15000; i++) {

//			values[x]=i;
//			x++;

			values[i] = i;

			boolean prime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					prime = false;
					break;

				}

			}

			if (prime) {
				if (values[i] > largest)
					largest = values[i];

			}

		}
		System.out.println(largest);
	}

}
