package decorator;

public class BasicBurger implements Burger {
    public String getDescription() {
        return "Основен бургер";
    }

    public double getCost() {
        return 2.0;
    }
}