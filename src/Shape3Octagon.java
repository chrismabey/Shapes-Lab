import java.awt.*;

public class Shape3Octagon implements Shape
{
   public void drawShape(Graphics g)
   {
	   Polygon octagon = new Polygon();
	   octagon.addPoint(50,100);
	   octagon.addPoint(100,50);
	   octagon.addPoint(250,50);
	   octagon.addPoint(300,100);
	   octagon.addPoint(300,200);
	   octagon.addPoint(250,250);
	   octagon.addPoint(100,250);
	   octagon.addPoint(50,200);
	   g.setColor(Color.black);
	   g.drawPolygon(octagon);
	  
   }
}
