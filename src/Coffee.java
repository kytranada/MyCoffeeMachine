
public class Coffee {
    private int water;
    private int milk;
    private int beans;
    private int dCups;
    private int money;

    public Coffee() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.dCups = 9;
        this.money = 550;
    }

    public void makeEspresso() {
        if (water >= 250 && beans >= 16) {
            System.out.println("I have enough resources, making you a coffee!\n");
            water -= 250;
            beans -= 16;
            dCups -= 1;
            money += 4;
        } else {
            System.out.println("Sorry not enough resources!\n");
        }
    }

    public void makeLatte() {
        if (water >= 350 && milk >= 20 && beans >= 20 && dCups >= 1) {
            System.out.println("I have enough resources, making you a latte!\n");
            water -= 350;
            milk -= 75;
            beans -= 20;
            dCups -= 1;
            money += 7;
        } else {
            System.out.println("Sorry not enough resources!\n");
        }
    }

    public void makeCappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && dCups >= 1) {
            System.out.println("I have enough resources, making you a cappuccino!\n");
            water -= 200;
            milk -= 100;
            beans -= 12;
            dCups -= 1;
            money += 6;
        } else {
            System.out.println("Sorry not enough resources!\n");
        }
    }

    public void fill(int addedWater, int addedMilk, int addedBeans, int addedDCups) {
        water += addedWater;
        milk += addedMilk;
        beans += addedBeans;
        dCups += addedDCups;
        System.out.println();
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println("There is $" + money + " left\n");
    }

    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(dCups + " disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}
