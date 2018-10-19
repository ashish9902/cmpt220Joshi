package area;

public class Bond {
	double coupon;
	int payments;
	double interest;
	double valueMaturity;
	public  double getPrice() {
		
			double inter = 1+ this.interest;
			double num = Math.pow(inter, this.payments);
			double cont = 1/num;
			double step2 = 1-cont;
			double step3 = step2*this.coupon;
			double calc= this.interest/100;
			double step4 = (1+calc);
			double step5 =Math.pow(step4, this.payments);
			double step6=this.valueMaturity*step5;
			double price=100;

		
		return price;
	}
	
	public Bond() {
		this.coupon = 0;
		this.payments = 0;
		this.interest = 0;
		this.valueMaturity = 0;
		
	}
	public Bond(double coupon, int payments, double interest, double valueMaturity) {
		this.coupon = coupon;
		this.payments = payments;
		this.interest = interest;
		this.valueMaturity = valueMaturity; 
		
	}
		
	}

