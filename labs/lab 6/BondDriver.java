package area;

import java.util.Scanner;
public class BondDriver {
	public static void main (String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter number of coupon payments ");
		double coupon = value.nextDouble();
		System.out.println("Enter number of  payments ");
		int payments = value.nextInt();
		System.out.println("Enter interest rate ");
		double interest = value.nextDouble();
		System.out.println("Enter value at Maturity ");
		double valueMaturity = value.nextDouble();
		

		
		Bond myBond = new Bond( coupon,  payments,  interest,  valueMaturity);
		System.out.println(myBond.getPrice());
		
		
	}

}
