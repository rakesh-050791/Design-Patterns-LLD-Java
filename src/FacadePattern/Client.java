package FacadePattern;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Shape(new Rectangle());
        shape.drawShape();
    }
}
