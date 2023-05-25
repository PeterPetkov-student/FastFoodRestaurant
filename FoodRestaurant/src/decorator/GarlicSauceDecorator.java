package decorator;

public class GarlicSauceDecorator extends BurgerDecorator {
    public GarlicSauceDecorator(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", с чеснов сос";
    }

    public double getCost() {
        return burger.getCost() + 0.5;
    }
}
