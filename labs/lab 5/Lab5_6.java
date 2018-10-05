package area;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
public class Lab5_6 {
	public static void main (String[] args) {
		double row;
	    double col;
        double column;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = scanner.nextDouble();
        
        System.out.println("Enter total number of columns : ");
        col = scanner.nextDouble();
        System.out.println("Enter the column whose average value you wish to calculate");
        column=scanner.nextDouble();
    
	double array[][] = new double[(int) row][(int) col];
	 for (int i = 0; i < row; i++) {
         for (int j = 0; j < col; j++) {
             System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
             array[i][j] = scanner.nextDouble();
         }
     }
     double arr= getAverage(array,(int) column);
     System.out.println("You have entered : ");
     for (int i = 0; i < row; i++) {
         for (int j = 0; j < col; j++) {
             System.out.print(array[i][j] + "\t");
         }
         System.out.println();
     
     }
     System.out.println("The average value of column" + column + "is "+arr);
	} 
	public static double getAverage(double [][] array, int column){
        int counter=0;
        double sum = 0;
        for(int i=0;i<array.length;i++){
            
                sum = sum+array[i][column];
                counter++;
            }
        

        return sum/(counter);
	
}
}

	
	
