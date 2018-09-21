package area;

public class Problem7Loops {
	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n <= 50; n++) {

			int a = (3 * n * n);
			int b = a - n;
			int c = b / 2;
			count++;
			if (count % 10 == 0)
				System.out.println(c);
			else
				System.out.print(c + " ");

		}
	}

}
