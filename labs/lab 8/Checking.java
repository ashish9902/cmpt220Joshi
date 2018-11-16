package area;

public class Checking extends Account {

	public final double OVERDRAFTLIMIT = 100.00;

	public Checking(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	super(accNumber, balance, annualInterestRate, dateCreated);
	}

	@Override
	public void withdraw(double amount)
	{ // JA: The overdraft works the other way. You can go negative to that amount.
	if(balance - amount <= OVERDRAFTLIMIT)
	{
	System.out.println("Sorry!!! Your balance cannot goes below " + OVERDRAFTLIMIT);
	}
	else
	{
	super.withdraw(amount);
	}
	}

	@Override
	public String toString()
	{
	String res = "Checking account Details\n";
	res += super.toString();
	return res;
	}
	}

