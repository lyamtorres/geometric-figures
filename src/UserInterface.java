import java.awt.*;
import javax.swing.*;

public class UserInterface extends JPanel {
	private Shape figure;
	
	public void setShape(Shape figure) {
		this.figure = figure;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);	
		
		if(figure != null) figure.draw(g);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Générateurs de chemins");
		UserInterface ui = new UserInterface();
		Point A = new Point(200, 100);
		Square sqr = new Square(A, 200);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(ui);
		window.setSize(600, 400);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		
		ui.setShape(sqr);

	}

}
