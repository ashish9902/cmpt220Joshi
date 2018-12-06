package area;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


	
public class TestApp {
	
	public static void main(String[] args) {

		ArrayList<Appliance> ar = new ArrayList<Appliance>(40);
		Appliance lok = new Appliance();
		SortbyPrice sort= new SortbyPrice();
		//Comparator<Appliance> comp = new Comparator<Appliance>();
		double[] TVPrice= {300,500,700};
		double [] ToasterPrice= {200,240,210};
		double [] TelephonePrice= {60,90,30};
		

		
		for (int i = 0; i < 40; i++) {
			double randy = Math.random();
			double randy1 = Math.random() *100;
			if (randy < 0.60 && randy >0.30) {
				Appliance obj = new Telephone();
				obj.setPrice(arValue(TelephonePrice));// randomize later
				ar.add( obj);
			} else if (randy < 0.29) {
				Appliance obj2= new TV();
				obj2.setPrice(arValue(TVPrice));
				ar.add( obj2);
			} else {
				Appliance obj3= new Toaster();
				obj3.setPrice(arValue(ToasterPrice));
				ar.add( obj3);
				
				

			}
			
			
		}
		/*for (int i=0; i<40;i++) {
				//System.out.println(ar.get(i).getPrice());
				
		}*/
		//beginning the sort function
		Collections.sort(ar,new SortbyPrice());
		for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i).getPrice()); 
		
		

	}
	public static double arValue(double [] blank) {
		double randy= Math.random();
	
		if (randy < 0.60 && randy >0.30 ) {
			return blank[0];
			
		}
		if (randy < 0.29) {
			return blank[1];
		}
		
		if (randy>0.6) {
			return blank[2];
			
			
		}
		return 0;
		
		
		
	}

	

	}

