import java.awt.*;

public interface Shape {
	public abstract void draw(Graphics g);
	
	public abstract void translate(double dx,double dy);
}
