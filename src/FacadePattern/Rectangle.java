package FacadePattern;

public class Rectangle implements Shapemaker{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw");
    }
}
