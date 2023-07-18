package FacadePattern;

public class Circle implements Shapemaker{
    @Override
    public void draw(){
        System.out.println("Circle::draw()");
    }
}
