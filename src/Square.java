
public class Square implements Shape {
	
	public Point upperLeftCorner;
	public double side;
	public Square(Point upperLeftCorner, double side) {
		this.upperLeftCorner = upperLeftCorner;
		this.side = side;
	}

	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public double getSide() {
		return side;
	}
	
	public double area() {
		return side*side;
	}

	public Point lowerRightCorner() {
		return new Point(upperLeftCorner.getX()+side,upperLeftCorner.getY()-side);
	}
	
	public Point lowerLeftCorner() {
		return new Point(upperLeftCorner.getX(),upperLeftCorner.getY()-side);
	}
	
	public Point upperRightCorner() {
		return new Point(upperLeftCorner.getX()+side,upperLeftCorner.getY());
	}
	
	public void translate(double dx,double dy) {
		this.upperLeftCorner.move(dx,dy);
	}
}
