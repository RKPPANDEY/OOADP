
import java.util.*;

/**
 * 
 */
public abstract class Shape {

    Drawing drawing;
    public Shape(Drawing drawing) {
     this.drawing=drawing;
    }



    /**
     * 
     */
    public abstract void draw();

}
