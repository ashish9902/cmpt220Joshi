package area;

public class TV extends Appliance {

	public TV(double voltage, String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		// TODO Auto-generated constructor stub
	}
	public TV(double price) {
		
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	public static String Watch(String color) {
		return   color;
	}
	void changeChannel (int newValue){//method to change the channel 
        int channel = newValue; 
	}

	void changeVolume (int newValue){ //method to change the volume 
            int volume = newValue;
	}


	/*public TV(double price) {
		
	}*/

}
