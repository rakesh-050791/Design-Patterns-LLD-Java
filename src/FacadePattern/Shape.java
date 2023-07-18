package FacadePattern;

public class Shape {

    Shapemaker shapeObj;

    public Shape(Shapemaker shapeObj){
        this.shapeObj = shapeObj;
    };

    public void drawShape(){
        shapeObj.draw();
    }
}
