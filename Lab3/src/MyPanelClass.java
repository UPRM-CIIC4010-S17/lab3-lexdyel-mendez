import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        
                        
                        //Draw 2 white Stripes
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 / 5, y2 / 5, width + 1, height / 5);
                        g.fillRect( x1 + (x2 / 5), y2 - ((y2 * 2) /5), width + 1, height / 5);
                        
                        //Draw the blue triangle
                        Polygon p1 = new Polygon();
                        p1.addPoint(x1, y1);
                        p1.addPoint(x2 / 2, y2 /2);
                        p1.addPoint(x1, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p1);
                        
                        //Draw the Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + (int)(x2/15.3), y1 + (int)(y2/2.25));
                        p2.addPoint(x1 + (int)(x2/7.4), y1 + (int)(y2/2.25));
                        p2.addPoint(x1 + (int)(x2/6.2), y1 + (int)(y2/3.4));
                        p2.addPoint(x1 + (int)(x2/5.3), y1 + (int)(y2/2.25));
                        p2.addPoint(x1 + (int)(x2/3.89), y1 + (int)(y2/2.25));
                        p2.addPoint(x1 + (int)(x2/5), y1 + (int)(y2/1.9));
                        p2.addPoint(x1 + (int)(x2/4.5), y1 + (int)(y2/1.52) );
                        p2.addPoint(x1 + (int)(x2/6.2), y1 + (int)(y2/1.8) );
                        p2.addPoint(x1 + (int)(x2/9.5), y1 + (int)(y2/1.52) );
                        p2.addPoint(x1 + (int)(x2/8.3), y1 + (int)(y2/1.9));
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);

            }
}