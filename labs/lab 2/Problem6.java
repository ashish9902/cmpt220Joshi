package area;

import java.util.Random;
public class Problem6 {
	public static void main(String [] args) {
		int number1, number2, number3; 
        int set2, set3; 
        
        Random generator = new Random();
        
     
        number1 = generator.nextInt(7) + 1; 
        number2 = generator.nextInt(8); 
        number3 = generator.nextInt(8);
        
        
        set2 = generator.nextInt(300) + 101;
        
        
        set3 = generator.nextInt(7999) + 1001;
        
        System.out.println ( "(" + number1 + "" + number2 + "" + number3 + ")"  + set2 + "-" + set3 );
        
		
		
		
	}

}
