package area;

public class Triangle extends GeometricObject {
	
	       double side1 = 1.0;
	       double side2 = 1.0;
	       double side3 = 1.0;
	  
	      
	       public Triangle() {
	          super();
	           side1 = 0.0;
	           side2 = 0.0;
	           side3 = 0.0;
	       }
	  
	     
	      public Triangle(double a, double b, double c, String color, boolean filled) {
	    	  super(color, filled);
	       		try {
	       			
	 	           side1 = a;
	 	           side2 = b;
	 	           side3 = c;
	       			/*System.out.println("Enter side 1 of a triangle");
	       			double side1= in.nextDouble();
	       			System.out.println("Enter side 2 of a triangle");
	       			double side2= in.nextDouble();
	       			System.out.println("Enter side 3 of a triangle");
	       			double side3= in.nextDouble();*/
	       			if((side1+side2)<side3 || (side1+side3)<side2|| (side2+side3)<side1) {
	       				throw new IllegalTriangleException("The length of one side is greater than the sum of the other two");
	       			}
	       			
	       		} catch (Exception ex) {
	       			System.out.println(ex.getMessage());
	       		}
	       		
	       		
	       	
	       }
	      public void setSide1(double side1) {
	           this.side1 = side1;
	       }
	  
	       public double getSide1() {
	           return side1;
	       }
	  

	      
	      
	       public void setSide2(double side2) {
	           this.side2 = side2;
	       }
	
	       public double getSide2() {
	           return side2;
	       }
	  
	       public void setSide3(double side3) {
	           this.side3 = side3;
	       }
	      
	      
	       public double getSide3() {
	           return side3;
	       }
	  
	  
	       public void show() {
	           System.out.println(side1+","+side2+","+side3+",");
	       }
	  
	      
	       public double getArea(){
	           double s=(side1+side2+side3)/2;
	            double triArea=s*(s-side1)*(s-side2)*(s-side3);
	            return triArea;
	  
	       }
	  
	     
	       public double getPerimeter(){
	           return (side1 + side2 + side3);
	       }
	  
	      
	       public String toString(){
	          
	           return "Triangle: side1 = " + side1 + " side2 = " + side2 +
	                   " side3 = " + side3 +" "+
	           super.toString();
	       }
	   
	

}
