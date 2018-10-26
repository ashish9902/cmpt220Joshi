package area;

public class MyLongDriver {
	public static void main (String [] args) {
		char[] arr= {'a','b','c','d','e'};
		MyLong checker= new MyLong();
	
		System.out.println();
		long[] longarr=checker.parseLong(arr);
		for(int i=0; i<longarr.length;i++) {
			System.out.println(longarr[i]+" ");
		}
		if (checker.isEven()) 
			System.out.println("Even");
		if (checker.isOdd())
			System.out.println("Odd");
		if (checker.isPrime())
			System.out.println("Prime");
		
		
	}
	


}
