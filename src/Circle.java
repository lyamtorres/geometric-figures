import java.awt.*;

public class Circle implements Shape {
	private Point center;
	private double radius;
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}	
	
	public void draw(Graphics g) {
		
	}
	
	public void translate(double dx,double dy) {
		this.center.move(dx,dy);
	}
}
