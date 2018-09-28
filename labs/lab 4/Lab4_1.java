package area;

public class Lab4_1 {
	public static void main(String[] args) {

		int count = 1;
		double cm_inches;
		double inch_cm;
		double d = 2.3232;

		System.out.println("Inches to CM | CM to Inches");

		for (int i = 1; i <= 50; i++) {
			cm_inches = count * 0.39;

			inch_cm = i * 2.54;

			System.out.print(String.format("%1$3s", i) + " ");
			System.out.print(String.format("%8.2f", inch_cm) + " | ");
			System.out.print(String.format("%1$3s", count) + " ");
			System.out.print(String.format("%8.2f", cm_inches) + " ");
			System.out.println();

			count += 5;
		}

	}

}
