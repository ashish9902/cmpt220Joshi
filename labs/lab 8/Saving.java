package area;

public class Saving extends Account {
	 
		 public Saving(int accNumber, double balance, double annualInterestRate, String dateCreated) {
		 super(accNumber, balance, annualInterestRate, dateCreated);
		 }

		 @Override
		 public String toString()
		 {
		 String res = "Savings account Details\n";
		 res += super.toString();
		 return res;
		 }
		 }

		 class TestAccount
		 {
		 public static void main(String[] args)
		 {
		 Account acct = new Account(1001, 500, 3.5, "02-05-2014");
		 Checking cacct = new Checking(1002, 1000, 4.0, "06-08-2014");
		 Saving sacct = new Saving(1003, 750, 4.0, "05-07-2013");
		 System.out.println(acct.toString());
		 System.out.println(cacct.toString());
		 System.out.println(sacct.toString());
		 }
		 }


