package area;

import java.util.Scanner;

import java.util.Random;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Movie {
	public static void main(String[] args) {

		MovieMethods myName = new MovieMethods();
		Scanner in = new Scanner(System.in);
		System.out.println("Greetings, what is your name");
		String name = in.nextLine();
		boolean pop = false;
		boolean pretz = false;
		boolean soda = false;
		boolean candy = false;
		boolean recline = false;
		boolean pop1 = false;
		boolean pretz1 = false;
		boolean soda1 = false;
		boolean candy1 = false;
		

		System.out.println(myName.nameCapitalize(name) + " what movie would you like to see");

		String[] arr = { "Smallfoot", "Night School", "The Meg", "Mission Impossible" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("If you want to see " + arr[i] + " press " + (i + 1));
		}

		int value = in.nextInt();

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Smallfoot", 1);
		map.put("Night School", 2);
		map.put("The Meg", 3);
		map.put("Mission Impossible", 4);

		String[] times = { "1:30", "4:45", "7:15", "10:30" };
		String[] times2 = { "2:30", "5:45", "8:15", "11:30" };
		String[] times3 = { "3:30", "6:45", "9:15", "12:30" };
		String[] times4 = { "4:30", "7:45", "10:15", "12:30" };

		switch (value) {
		case 1:
			value = 1;
			System.out.println("Smallfoot has multiple playing times what time would you like to see it?");
			for (int i = 0; i < times.length; i++) {
				System.out.println("Press " + (i + 1) + " for " + times[i]);
			}
			break;

		case 2:
			value = 2;
			System.out.println("Night School has multiple playing times what time would you like to see it?");
			for (int i = 0; i < times2.length; i++) {
				System.out.println("Press " + (i + 1) + " for " + times2[i]);
			}
			break;
		case 3:
			value = 3;
			System.out.println("The Meg has multiple playing times what time would you like to see it?");
			for (int i = 0; i < times3.length; i++) {
				System.out.println("Press " + (i + 1) + " for " + times3[i]);
			}
			break;
		case 4:
			value = 4;
			System.out.println("Mission Impossible has multiple playing times what time would you like to see it?");
			for (int i = 0; i < times4.length; i++) {
				System.out.println("Press " + (i + 1) + " for " + times4[i]);
			}
			break;

		}

		int min;
		while (true) {
			try {
				min = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("Invalid input. Please reenter: ");
				in.nextLine();
			}
		}

		if (value == 1 && min == 1) {
			System.out.println("Would you like to confirm your movie time of " + times[0]);
		} else if (value == 1 && min == 2) {
			System.out.println("Would you like to confirm your movie time of " + times[1]);
		} else if (value == 1 && min == 3) {
			System.out.println("Would you like to confirm your movie time of " + times[2]);
		} else if (value == 1 && min == 4) {
			System.out.println("Would you like to confirm your movie time of " + times[3]);
		} else if (value == 2 && min == 1) {
			System.out.println("Would you like to confirm your movie time of " + times2[0]);
		} else if (value == 2 && min == 2) {
			System.out.println("Would you like to confirm your movie time of " + times2[1]);
		} else if (value == 2 && min == 3) {
			System.out.println("Would you like to confirm your movie time of " + times2[2]);
		} else if (value == 2 && min == 4) {
			System.out.println("Would you like to confirm your movie time of " + times2[3]);
		} else if (value == 3 && min == 1) {
			System.out.println("Would you like to confirm your movie time of " + times3[0]);
		} else if (value == 3 && min == 2) {
			System.out.println("Would you like to confirm your movie time of " + times3[1]);
		} else if (value == 3 && min == 3) {
			System.out.println("Would you like to confirm your movie time of " + times3[2]);
		} else if (value == 3 && min == 4) {
			System.out.println("Would you like to confirm your movie time of " + times3[3]);
		} else if (value == 4 && min == 1) {
			System.out.println("Would you like to confirm your movie time of " + times4[0]);
		} else if (value == 4 && min == 2) {
			System.out.println("Would you like to confirm your movie time of " + times4[1]);
		} else if (value == 4 && min == 3) {
			System.out.println("Would you like to confirm your movie time of " + times4[2]);
		} else if (value == 4 && min == 4) {
			System.out.println("Would you like to confirm your movie time of " + times4[3]);
		}
		String confirm = in.next();
		if (!confirm.equals("yes")) {
			throw new IllegalArgumentException("Sorry to hear that, please visit us again");
		}

		System.out.println("What would you like " + myName.Refreshments());
		String food = in.next();
		if (food.equals("popcorn")) {
			pop = myName.PopCorn(in);
		

		}
		else if (food.equals("pretzels")) {
			pretz = myName.Pretzels(in);


		}
		else if (food.equals("soda")) {
			soda = myName.Soda(in);


		}
		else if (food.equals("candy")) {
			candy = myName.Candy(in);
	

		}
		else {
			System.out.println("Sorry to hear that, the snacks are delicious here");
		}
		recline = (myName.Recline(in));
		
		if (food.equals("popcorn")) {
			myName.finalBillPop(in,pop,recline);
		

		}
		else if (food.equals("pretzels")) {
			myName.finalBillPretzel(in,pretz,recline);


		}
		else if (food.equals("soda")) {
			myName.finalBillSoda(in,soda,recline);


		}
		else if (food.equals("candy")) {
			myName.finalBillCandy(in,candy,recline);

		}
		else {
			System.out.println("Have a nice show");
			System.out.println("Your seat is " + myName.seatGen());
			System.out.println("Your total cost is "+ (myName.ticketPriceGenerator()));
			
		}
		
		
		
		
		
		
		
		

		

	}

}
