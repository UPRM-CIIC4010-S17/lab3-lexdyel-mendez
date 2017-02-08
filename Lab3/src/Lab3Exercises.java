import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Lexdyel Mendez");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = (int) dim.getWidth();
		int height =(int)  dim.getHeight();
		
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setSize(200, 200);
		myFrame.setLocation(width/2 - myFrame.getWidth()/2, height/2 - myFrame.getHeight()/2);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
	}
}