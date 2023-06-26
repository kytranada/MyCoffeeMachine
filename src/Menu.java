
public class Menu {
    private static final Coffee coffee = new Coffee();

    public static void theMenu() {
        // Starting Loop for Machine
        boolean exit = false;
        do {
            // Getting user input
            System.out.println("Choose an action! (buy, fill, take, remaining, exit):");
            String input = CoffeeMachine.sc.next().toLowerCase();
            System.out.println();

            // Switch-Case operations for user input actions
            switch (input) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> remaining();
                case "exit" -> exit = true;
                default -> {
                    System.out.println("Wrong keyword! Please try again!");
                    theMenu();
                }
            }
        } while (!exit);
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input = CoffeeMachine.sc.next();
        switch (input) {
            case "1" -> coffee.makeEspresso();
            case "2" -> coffee.makeLatte();
            case "3" -> coffee.makeCappuccino();
            case "back" -> theMenu();
            default -> {
                System.out.println("Wrong selection! Please try again!");
                buy();
            }
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        int addedWater = CoffeeMachine.sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int addedMilk = CoffeeMachine.sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int addedBeans = CoffeeMachine.sc.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        int addedDCups = CoffeeMachine.sc.nextInt();

        coffee.fill(addedWater, addedMilk, addedBeans, addedDCups);
    }

    public static void take() {
        coffee.take();
    }

    public static void remaining() {
        coffee.remaining();
    }
}
