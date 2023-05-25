package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Burger burger = new BasicBurger();
        burger = new GarlicSauceDecorator(burger);
        burger = new KetchupDecorator(burger);
        System.out.println("Описание: " + burger.getDescription());
        System.out.println("Цена: " + burger.getCost());
    }
}