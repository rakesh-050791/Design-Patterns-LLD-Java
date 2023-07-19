package DecoratorPattern;

public class Hirtenkase extends ToppingDecorator{

    BasePizza basePizza;

    public Hirtenkase(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 60;
    }
}
