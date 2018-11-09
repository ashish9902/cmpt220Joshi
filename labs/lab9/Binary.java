package area;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string that is binary");

		String binaryString = in.next();
		long val = bin2Dec(binaryString);

		System.out.println(val);

	}

	public static long bin2Dec(String binaryString) {

		try {

			int oneCount = 0;
			boolean validBinaryNum = true;
			{
				for (int i = 0; i < binaryString.length() && validBinaryNum; i++) {
					char currentChar = binaryString.charAt(i);
					if (currentChar == '1')
						oneCount++;
					else if (currentChar != '0') {
						validBinaryNum = false;
						if (validBinaryNum && binaryString.length() != 0) {
							System.out.println("Number of 1's: " + oneCount);
						} else {
							throw new NumberFormatException("The string you entered is not binary");
						}
					}
				}

			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		double j = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				j = j + Math.pow(2, binaryString.length() - 1 - i);
			}

		}
		return (int) j;

	}

}


/*

64 32 0  8  0  0  1
1  1  0  1  0  0  1

1  1  1  1
  = 15
  
1 0 4 0 1
 = 1 + 0 * 10 + 400 +   

1  5  6
 = 100 + 50 + 6


1  1  0  1  0  0  1

4  5  3  3  5  2  0





*/
