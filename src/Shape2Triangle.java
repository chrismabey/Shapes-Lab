import java.awt.*;

public class Shape2Triangle implements Shape
{
   public void drawShape(Graphics g)
   {
	   Polygon triangle = new Polygon();
	   triangle.addPoint(600,60);
	   triangle.addPoint(700,220);
	   triangle.addPoint(500,220);
	   g.setColor(Color.black);
	   g.fillPolygon(triangle);
	   
   }
}
