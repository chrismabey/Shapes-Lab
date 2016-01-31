
import java.awt.*;

public class Shape3Octagon implements Shape
{	
   public void drawShape(Graphics g)
   {
	   Polygon octagon = new Polygon();
	   octagon.addPoint(160,360);
	   octagon.addPoint(240,360);
	   octagon.addPoint(280,400);
	   octagon.addPoint(280,480);
	   octagon.addPoint(240,520);
	   octagon.addPoint(160,520);
	   octagon.addPoint(120,480);
	   octagon.addPoint(120,400);
	   g.setColor(Color.black);
	   g.fillPolygon(octagon);
	  
   }
}
