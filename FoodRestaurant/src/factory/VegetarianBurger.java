package factory;

import decorator.Burger;

public class VegetarianBurger implements Burger {
    public String getDescription() {
        return "Вегетариански бургер";
    }

    public double getCost() {
        return 3.5;
    }
}
