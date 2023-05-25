package command;

public class CashierCommand implements Command {
    private Chef chef;
    private String burgerType;

    public CashierCommand(Chef chef, String burgerType) {
        this.chef = chef;
        this.burgerType = burgerType;
    }

    public void execute() {
        chef.cookBurger(burgerType);
    }
}