package area;

public class Sub1 extends AbstractClass {
	
	
	public void printMessage() {
		System.out.println("This is the first subclass");
		
		
	}
	 public static void main(String args[]){
			AbstractClass obj = new Sub1();
			obj.printMessage();
		   }

}
