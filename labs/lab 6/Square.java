package area;



public class Square {
	double width;

	

	public  double getArea() {

		return this.width * this.width;

	}

	public double getPerimeter() {

		return this.width * 4;
	}

	public Square() {
		this.width = 1;
	}
	public Square(double width) {
		this.width = width;
	}

}
