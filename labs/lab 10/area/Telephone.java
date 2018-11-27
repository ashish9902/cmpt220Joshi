package area;

public class Telephone extends Appliance {

	public Telephone(double voltage, String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		// TODO Auto-generated constructor stub
	}
		private String areaCode;

		private String localNumber;

		public Telephone(String area,String num)

		{

		this.areaCode = area;

		this.localNumber = num;

		}

		public Telephone(int area,String num)

		{

		this.areaCode = ""+area;

		this.localNumber = num;

		}
		public Telephone() {
			// TODO Auto-generated constructor stub
		}
		public void setPrice(double price) {
			this.price=price;
		}
		

		
	
	

}
