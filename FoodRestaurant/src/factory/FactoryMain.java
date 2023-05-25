package factory;

import decorator.Burger;

public class FactoryMain {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactoryImpl();
        Burger burger = burgerFactory.createBurger("кралски");
        System.out.println("Описание: " + burger.getDescription());
        System.out.println("Цена: " + burger.getCost());
    }
}