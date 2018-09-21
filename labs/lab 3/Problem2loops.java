package area;

public class Problem2loops {
	public static void main(String args[]) {
		int count = 0;
		for (int i = 100; i <= 500; i++) {
			// if (i % 7 == 0 ^ i % 5 == 0)
			if (i % 7 == 0 && i % 5 != 0 || i % 7 != 0 && i % 5 == 0) {
				count++;

				if (count % 10 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");

			}

		}

	}

}
