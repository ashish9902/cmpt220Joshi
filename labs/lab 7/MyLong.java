package area;

public class MyLong {
	long value=23;
	char [] myArray= {'a','b','c','d','e'};
	
	
	public MyLong() {

	}

	public Long myLong(long value) {
		return value;
		

	}
	public void setValue(long value) {
		this.value=value;
		
	}
	public Long getValue() {
		return this.value;
	}

	public  boolean isEven() {
		if (this.value % 2 == 0)
			return true;
		else
			return false;
	
	}

	public boolean isOdd() {
		return this.value % 2 != 0;
	
	}

	public boolean isPrime() {
		if (this.value <= 1) return false;
		for (int i=2;i<this.value;i++) {
			if (this.value % i ==  0) {
				return false;
			}
			
		}
	 
		return true;
	}


	public static boolean isEven(long num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	
	}
	public static boolean isOdd( long num) {
		return num % 2 != 0;
	}

	public static boolean isPrime (long num) {
		if (num <= 1) return false;
		for (int i=2;i<num;i++) {
			if (num % i ==  0) {
				return false;
			}
		
		}
		return true;
	}
				
	public static boolean isEven(MyLong store) {
		if (store.value % 2 ==0)
			return true;
		else 
			return false;
	
		
	}
	public static boolean isOdd(MyLong store) {
		if (store.value% 2!=0)
			return true;
		else
			return false;
			
	}

	public static boolean isPrime(MyLong store) {
		if (store.value <= 1) return false;
		for (int i=2;i<store.value;i++) {
			if (store.value % i ==  0) {
				return false;
			}
			
		}
		return true;
	}

	public boolean equals(MyLong num) {
		return (num.value == value);
	
	}
	public boolean equals(long num) {
		return (num== value);
	}
	public static long[] parseLong(char[] myArray) {
		long[] longValues= new long[myArray.length];
		for(int i=0; i<myArray.length;i++) {
			longValues[i]=Long.valueOf(myArray[i]);
		}
		return longValues;
		
	}
	public static void parseLong(String s) {
		  Long.parseLong(s);
		
	}
}
	


