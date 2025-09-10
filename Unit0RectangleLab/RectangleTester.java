
public class RectangleTester {
    public static void main() {
        Rectangle rect = new Rectangle(4, 5);
        System.out.println(rect.calculateArea());
        rect.rotate();
        System.out.println(("Bottom x is " + rect.bottomLeftX() 
            + "and Bottom y is " + rect.bottomLeftY()));
    }
}
