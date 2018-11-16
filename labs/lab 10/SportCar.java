package area;

public class SportCar implements Printable {
	String name;
	double namePlate;
	
	public SportCar(String name, double NamePlate) {
		this.name=name;
		this.namePlate=NamePlate;
	}
	@Override
	public void print() {
		System.out.println("Car brand " + this.name + " License Plate " + this.namePlate);
	};
	


}
