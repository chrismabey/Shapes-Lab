import java.awt.*;

public class Shape1Square implements Shape
{	
   public void drawShape(Graphics g)
   {
	   Polygon square = new Polygon();
		square.addPoint(50,30);
		square.addPoint(150,30);
		square.addPoint(150,130);
		square.addPoint(50,130);
		g.setColor(Color.black);
		g.drawPolygon(square);
		
   }
}
