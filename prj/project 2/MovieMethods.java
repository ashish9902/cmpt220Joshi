package area;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class MovieMethods {
	public static String nameCapitalize(String name) {
		if (name == null || name.length() == 0) {
			return name;
		}
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	public static int ticketPriceGenerator() {
		int ticket = 12;

		return ticket;
	}

	public static String seatGen() {
		String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" };
		String[] num = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		Random gen = new Random();
		int index = gen.nextInt(alpha.length);
		int index1 = gen.nextInt(num.length);
		return (alpha[index]) + (num[index1]);

	}

	public static String Refreshments() {
		String[] food = { "popcorn", "candy", "pretzels", "soda" };
		return Arrays.toString(food);
	}

	public static boolean Soda(Scanner in) {
		System.out.println("Type s for sprite, c for CocaCola, d for Dr. Pepper, and f for fanta");
		String soda = in.next();
		switch (soda) {
		case "s":
			System.out.println("Here is your Sprite");
			return true;
	
		case "c":
			System.out.println("Here is your CocaCola");
			return true;
		
		case "d":
			System.out.println("Here is your Dr. Pepper");
			return true;
			
		case "f":
			System.out.println("Here is your Fanta");
			return true;
			
		default:
			System.out.println("We don't sell that type of soda here");
			return false;

		}

		
	}

	public static boolean PopCorn(Scanner in) {
		System.out.println("Would you like extra butter on your popcorn, it will cost an extra $1.50, leading your cost to be 3 more");
		String butter = in.next();
		if (butter.equals("yes")) {
			System.out.println("Here is your popcorn with extra butter");
			return true;

		} else {
			System.out.println("Here is your popcorn without butter");
			return false;
		}
		

	}
	public static boolean Recline(Scanner in) {
		System.out.println("Would you like to upgrade your seat to a recliner for an additional $3");
		String recline= in.next();
		if (recline.equals("yes")) {
			System.out.println("Great, I will add that to your final bill");
			return true;
		}
		else {
			System.out.println("Sorry to hear that, the recliner seats are very comfy");
			return false;
		}
		
		

	}

	public static boolean Pretzels(Scanner in) {

		System.out.println("We only serve soft pretzels, and it will cost an additional 2 dollars is that ok?");
		String pretz = in.next();

		if (pretz.equals("yes")) {
			System.out.println("And here is your pretzels hope you enjoy the show");
			return true;
		} else {
			System.out.println("Sorry to hear that, the pretzels are really good");
			return false;
		}
		

	}


	public static boolean Candy(Scanner in) {

		System.out.println("Type s for snickers, t for twizzlers, and r for reese's puffs");
		String candy = in.next();
		String candy1 = nameCapitalize(candy);
		if (candy1.matches("S")) {
			System.out.println("And here is your Snickers hope you enjoy the show");
			return true;

		} else if (candy1.matches("T")) {
			System.out.println("And here is your Twizzlers hope you enjoy the show");
			return true;

		} else if (candy1.matches("R")) {
			 System.out.println("And here is your Reese's Puffs hope you enjoy the show");
			 return true;

		} else {
			System.out.println("We don't sell that type of candy here");
			return false;
		}

		
	}

	
	
	public static void finalBillPop(Scanner in, boolean  popcorn, boolean recline) {
		if (popcorn == true && recline == true ) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3+ 3)));
			
		}
		else if (popcorn == true && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3)));
			
		}
		else if (popcorn == false && recline == true) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3)));
			
		}
		else if (popcorn == false && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (1.5)));
			
		}
		
	}
	public static void finalBillCandy(Scanner in, boolean  candy, boolean recline) {
		if (candy == true && recline == true ) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (1.5+ 3)));
			
		}
		else if (candy == true && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (1.5)));
			
		}
		else if (candy == false && recline == true) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3)));
			
		}
		else if (candy == false && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  ));
			
		}
		
	}
	public static void finalBillPretzel(Scanner in, boolean  pretzel, boolean recline) {
		if (pretzel == true && recline == true ) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (2+ 3)));
			
		}
		else if (pretzel == true && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (2)));
			
		}
		else if (pretzel == false && recline == true) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3)));
			
		}
		else if (pretzel == false && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  ));
			
		}
		
	}
	public static void finalBillSoda(Scanner in, boolean  soda, boolean recline) {
		if (soda == true && recline == true ) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3+ 1.5)));
			
		}
		else if (soda == true && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (1.5)));
			
		}
		else if (soda == false && recline == true) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  + (3)));
			
		}
		else if (soda == false && recline == false) {
			System.out.println("Your seat is " + seatGen());
			System.out.println("Your total cost is "+ (ticketPriceGenerator()  ));
			
		}
		
	}

}
