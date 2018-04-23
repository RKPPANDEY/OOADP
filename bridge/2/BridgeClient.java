
import java.util.*;

/**
 * 
 */
public class BridgeClient {
    public static void main(String[] args){
     Drawing dp1=new V1Drawing();
     Drawing dp2=new V2Drawing(); 
     Shape rect1=new Rectangle(dp1,50,200,60,100);
     rect1.draw();
     Shape sqr1=new Square(dp2,10,40,20,50);
     sqr1.draw();  
}
}
