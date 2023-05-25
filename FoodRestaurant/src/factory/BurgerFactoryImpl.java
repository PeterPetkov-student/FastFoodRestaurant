package factory;

import decorator.Burger;

public class BurgerFactoryImpl implements BurgerFactory {
    public Burger createBurger(String type) {
        if (type.equals("кралски")) {
            return new RoyalBurger();
        } else if (type.equals("класически")) {
            return new ClassicBurger();
        } else if (type.equals("вегетариански")) {
            return new VegetarianBurger();
        } else {
            return null;
        }
    }
}