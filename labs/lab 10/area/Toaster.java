package area;

public class Toaster extends Appliance {

	public Toaster(double voltage, String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		// TODO Auto-generated constructor stub
	}
	
	public Toaster(double price) {
		// TODO Auto-generated constructor stub
	}

	public Toaster() {
		// TODO Auto-generated constructor stub
	}

	void changeTemp (int newTemp){ //method to change the volume 
        int temp = newTemp;
	}
	void changeTime (int newTime){ //method to change the volume 
        int time = newTime;
	}
	public void setPrice(double price) {
		this.price=price;
	}
}
	


