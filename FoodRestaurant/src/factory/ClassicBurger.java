package factory;

import decorator.Burger;

public class ClassicBurger implements Burger {
    public String getDescription() {
        return "Класически бургер";
    }

    public double getCost() {
        return 3.0;
    }
}