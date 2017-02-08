import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Lexdyel Mendez");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = (int) dim.getWidth() /2 ;
		int height =(int)  dim.getHeight() /2;
		
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setSize(200, 200);
		myFrame.setLocation(width - myFrame.getWidth()/2, height - myFrame.getHeight()/2);
		myFrame.setVisible(true);
	}
}