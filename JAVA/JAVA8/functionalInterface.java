package JAVA.JAVA8;
@FunctionalInterface
interface Drawable{
    void draw();//only one fnction interface
}
public class functionalInterface {
    public static void main(String[] args) {
        Drawable d = ()->System.out.println("Method draw");
        d.draw();
    }
}
