
import java.util.*;

/**
 * 
 */
public class Rectangle extends Shape {

    double xx1,yy1,xx2,yy2;
    public Rectangle(Drawing dp,double x1,double y1,double x2,double y2) {
    super(dp);
    xx1=x1;
    yy1=y1;
    xx2=x2;
    yy2=y2;
    }

    /**
     * 
     */
    public void draw() {
        System.out.println("\n I am a Rectangle\n");
        drawing.drawLine(xx1,yy1,xx2,yy1);
        drawing.drawLine(xx2,yy1,xx2,yy2);
        drawing.drawLine(xx2,yy2,xx1,yy2);
        drawing.drawLine(xx1,yy2,xx1,yy1);
    }

    /**
     * 
     */
    //public abstract void draw();

}
