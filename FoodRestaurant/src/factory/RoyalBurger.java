package factory;

import decorator.Burger;

public class RoyalBurger implements Burger {
    public String getDescription() {
        return "Кралски бургер";
    }

    public double getCost() {
        return 4.0;
    }
}