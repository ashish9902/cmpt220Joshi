package area;

import java.util.ArrayList;

import java.util.Scanner;
public class SortArray {
	
	    public static void main(String[] args) {


	        Scanner in = new Scanner(System.in);

	        System.out.print("Please enter 5 numbers: ");

	       

	        ArrayList<Integer> list = new ArrayList<>();

	 

	        for (int a = 0; a < 5; a++) list.add(in.nextInt());

	       

	        sort(list);



	        System.out.println("Sorting numbers from lowest to highest");

	        System.out.println(list);

	    }


	    public static void sort(ArrayList<Integer> list) {

	

	        for (int a = 0; a < list.size() - 1; a++) {

	

	            int min = list.get(a);



	            int ind = a;

	          

	            for (int b = a + 1; b < list.size(); b++) {

	              

	                if (min > list.get(b)) {


	                    min = list.get(b);

	             

	                    ind = b;

	                }

	            }

	       

	            if (ind != a) {

	             

	                list.set(ind, list.get(a));

	                list.set(a, min);

	            }

	        }

	    }

	}




