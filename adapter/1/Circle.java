public class Circle extends Shape {

	private xxCircle xc;
    public Circle() {
    	xc=new xxCircle();
    }
    public void display() {
        xc.displayit();
    }

    public void fill() {
       xc.displayit();
    }

    public void undisplay() {
        xc.undisplayit();
    }

}