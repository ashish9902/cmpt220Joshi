package area;

public class Sub2 extends AbstractClass {
	
	public void printMessage() {
		System.out.println("This is the second subclass");
	}
	 public static void main(String args[]){
			AbstractClass obj = new Sub2();
			obj.printMessage();
		   }
	

}
