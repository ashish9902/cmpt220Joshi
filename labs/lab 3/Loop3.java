package area;

public class Loop3 {
	public static void main(String[] args) {
		int counter = 0;

		for (int i = 1; i <= 100; i++) {
			counter++;

			if (counter % 20 == 0)
				System.out.println(i);

			else
				System.out.print((char) i + " ");

		}
	}

}
