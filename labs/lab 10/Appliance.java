package area;

public class Appliance {
	double voltage;
	String color;
	String madeIn;
	 double price;
	public Appliance( double voltage, String color, String madeIn, double price) {
		
	}
	public Appliance() {
		
	}
	
	public void getVoltage() {
		this.voltage=voltage;
	}
	public String getColor() {
		return color;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int Compareto(Appliance ap, Appliance ap1) { 
		if(ap.price== ap1.price)  
			return 0;  
			else if(ap.price>ap1.price)  
			return 1;  
			else  
			return -1;  
			}  
		
	
	public String toString() {
		return "null";
	}
	Appliance[] appliance = new Appliance[40];
	
	
	
	

}
