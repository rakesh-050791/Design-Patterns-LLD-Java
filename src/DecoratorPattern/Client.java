package DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        BasePizza pizza = new Extracheese(

                new GrunerGartenPizza()
        );

        System.out.println("Pizza cost is " + pizza.cost());

        BasePizza pizza2 = new Hirtenkase(
                                            new Extracheese(
                                                    new FarmhousePizza()
                                            )
        );

        System.out.println("Pizza2 cost is " + pizza2.cost());
    }
}
