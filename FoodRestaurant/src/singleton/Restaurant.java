package singleton;

public class Restaurant {
    private static Restaurant instance;

    private Restaurant() {
        // Конструктор
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }
}