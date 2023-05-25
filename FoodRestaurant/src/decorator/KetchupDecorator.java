package decorator;

public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", с кетчуп";
    }

    public double getCost() {
        return burger.getCost() + 0.3;
    }
}