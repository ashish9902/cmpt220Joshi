package area;

public class TestAcc {
	public static void main(String[] args)
	{
	Account acct = new Account(121, 500, 3.5, "02-05-2014");
	Checking cacct = new Checking(1302, 1000, 4.0, "06-08-2014");
	Saving sacct = new Saving(1032, 750, 4.0, "05-07-2013");
	System.out.println(acct.toString());
	System.out.println(cacct.toString());
	System.out.println(sacct.toString());
	}
	}


