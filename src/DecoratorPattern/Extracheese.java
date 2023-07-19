package DecoratorPattern;

public class Extracheese extends ToppingDecorator{

    BasePizza basepizza;

    public Extracheese(BasePizza pizza){
        this.basepizza = pizza;
    };

    @Override
    public int cost() {
        return this.basepizza.cost() + 50;
    }
}
