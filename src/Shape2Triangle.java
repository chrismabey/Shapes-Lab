import java.awt.*;

public class Shape2Triangle implements Shape
{
   public void drawShape(Graphics g)
   {
	   Polygon triangle = new Polygon();
	   triangle.addPoint(600,50);
	   triangle.addPoint(700,175);
	   triangle.addPoint(500,175);
	   g.setColor(Color.black);
	   g.drawPolygon(triangle);
	   
   }
}
