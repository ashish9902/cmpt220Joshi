package area;

import java.util.Scanner;

public class Lab5_7 {
	public static void main (String[] args) {
	    double row;
	    double col;
        boolean isUpperTriangular = true;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = scanner.nextDouble();
        
        System.out.println("Enter total number of columns : ");
        col = scanner.nextDouble();
    
	double array[][] = new double[(int) row][(int) col];
	 for (int i = 0; i < row; i++) {
         for (int j = 0; j < col; j++) {
             System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
             array[i][j] = scanner.nextDouble();
         }
     }
     
     System.out.println("You have entered : ");
     for (int i = 0; i < row; i++) {
         for (int j = 0; j < col; j++) {
             System.out.print(array[i][j] + "\t");
         }
         System.out.println();
     }
     
     isUpperTriangular(array, row, col);
}
	public static boolean isUpperTriangular(double [][] array, double row, double col) {
	        boolean isUpperTriangular = true;
	       
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < i; j++) {
	                if (array[i][j] != 0) {
	                    isUpperTriangular = false;
	                    break;
	                }
	            }
	            if (!isUpperTriangular) {
	                break;
	            }
	        }
	        if(isUpperTriangular){
	            System.out.println("Upper triangular matrix.");
	        }else{
	            System.out.println("Not an Upper triangular matrix.");
	        }
		return true;
		
	}
}
		
