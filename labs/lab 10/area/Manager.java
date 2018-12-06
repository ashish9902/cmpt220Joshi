package area;

public  class Manager extends Employee implements Printable{
	public Manager(String name, double age, double hourRate) {
		super(name, age, hourRate);
		// TODO Auto-generated constructor stub
		
	}
	public Manager(String name, int age) {
		super(name,age);
	}
	public double salary(double hours) {
		return hours*hourRate;
	}
	
	public String toString() {
		return "name= " + name + " age=" + age + " hourRate=" + hourRate;
	}
	@Override
	public void print() {
		System.out.println(this.name + " " + this.age);
		
	}
	
	//public abstract double salary(double hours);
	

}
