package area;

public class TestLab {
    public static void main(String[] args) {
     
        Triangle my = new Triangle(2,4,7,"yellow", true);
       
        System.out.println("Area of Triangle " +my.getArea());

        System.out.println("Perimeter of triangle " +my.getPerimeter());
 
        System.out.println("color of the Triangle is " +my.getColor());
       
        System.out.println("is triangle filled " +my.isFilled());
    }
}



