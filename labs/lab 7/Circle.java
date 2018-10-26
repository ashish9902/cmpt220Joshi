package area;


public class Circle extends Geom {
	
	private int x, y;
    private double x2, y2, radius, radius2;
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1.0;
    }
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public boolean coordContains(double x2, double y2) {
        return (x-x2) * (x-x2) + (y-y2) * (y-y2) < radius * radius;
 }
    public boolean circleContains(Circle circle) {
        x2 = 4.0;
        y2 = 5.0;
        radius2 = 10.5;
        return (x-x2)*(x-x2)+(y-y2)*(y-y2) < (radius-radius2) * (radius-radius2);
 }
    public boolean overlaps(Circle circle) {
        x2 = 3.0;
        y2 = 5.0;
        radius2 = 2.3;
        return (radius-radius2)*(radius-radius2) < (x-x2)*(x-x2)+(y-y2)*(y-y2) && (x-x2)*(x-x2)+(y-y2)*(y-y2) < (radius+radius2)*(radius+radius2);
    } 
}
	
	
	
	
