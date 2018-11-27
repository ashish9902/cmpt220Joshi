package area;

public class Clerk extends Employee {
	public Clerk(String name, double age, double hourRate) {
		super(name, age, hourRate);
		// TODO Auto-generated constructor stub
		
		
	}
    public double salary(double hours) {
    	return hours*hourRate;
    }
	
	public String toString() {
		return "name= " + name + " age=" + age + " hourRate=" + hourRate;
	}
}
