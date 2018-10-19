package area;

import java.util.Scanner;

public class SquareDriver {
	public static void main (String[] args) {
		Square mySquare = new Square();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the width for the square");

		double width = in.nextDouble();
		System.out.println("Enter the width for the square");
		double width2 = in.nextDouble();
		
		
		System.out.println("The area of the square is " + mySquare.getArea());
		System.out.println("The perimeter of the square is " + mySquare.getPerimeter());
		Square mySquare2 = new Square(width);
		System.out.println("The area of the square is " + mySquare2.getArea());
		System.out.println("The perimeter of the square is " + mySquare2.getPerimeter());
		Square mySquare3 = new Square(width2);
		System.out.println("The area of the square is " + mySquare3.getArea());
		System.out.println("The perimeter of the square is " + mySquare3.getPerimeter());

	}

}
