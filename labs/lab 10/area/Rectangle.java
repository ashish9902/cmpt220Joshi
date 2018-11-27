package area;

public class Rectangle implements Printable {
	double length;
	double width;
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
    	
    }
	@Override
	public void print() {
		System.out.println("The length of the rectangle is " + this.length + " and the width is "+ this.width);
		
	}
	

}
