# MyCoffeeMachine

This is a simple Java Coffee Machine program that allows users to interact with a virtual coffee machine. Users can buy different types of coffee, fill the machine with resources, take the money from the machine, and check the current status of the machine.

## Features

- Buy: Users can choose from three types of coffee (espresso, latte, and cappuccino) or go back to the main menu.
- Fill: Users can add water, milk, coffee beans, and disposable cups to the machine.
- Take: Users can collect the money accumulated in the machine.
- Remaining: Users can check the current status of the machine, including the available resources and the amount of money.

## Instructions

1. Compile the Java files using a Java compiler.
2. Run the `CoffeeMachine` class to start the program.
3. Follow the on-screen prompts to interact with the coffee machine.
4. Choose an action by typing the corresponding keyword and pressing Enter.
5. Enjoy your virtual coffee experience!

## Class Structure

The code is structured into multiple classes to promote better organization and maintainability:

- CoffeeMachine: The main class that serves as the entry point for the program.
- Coffee: Manages the coffee-making process and handles the available resources.
- Menu: Handles the user interaction and provides a menu for selecting actions.

## Sample Code

```java
public class CoffeeMachine {
    public static void main(String[] args) {

      System.out.println("Welcome to My Coffee Machine!");

        // Calls theMenu method
        Menu.theMenu();
    }
}
