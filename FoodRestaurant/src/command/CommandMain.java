package command;

public class CommandMain {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Command cashierCommand = new CashierCommand(chef, "кралски");
        cashierCommand.execute();
    }
}