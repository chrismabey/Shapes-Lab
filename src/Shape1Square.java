import java.awt.*;

public class Shape1Square implements Shape
{	String shape1;
   public void drawShape(Graphics g)
   {
	   Polygon square = new Polygon();
		square.addPoint(120,60);
		square.addPoint(280,60);
		square.addPoint(280,220);
		square.addPoint(120,220);
		g.setColor(Color.black);
		g.fillPolygon(square);
   }
}
