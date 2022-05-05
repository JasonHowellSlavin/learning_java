package learning.java.apps;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        System.out.println("Welcome to Breakfasttown! We have the following");
        Breakfast.readItems();
        System.out.println("Type the combo number you want, or type MMO to make your own");
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        boolean MMO = order.equals("MMO");

        Breakfast myBreakfast = new Breakfast( MMO);

        if (MMO) {
            System.out.println("Make your own order by typing each item you want followed by a comma!");
            String mmoOrder = scanner.nextLine();
            myBreakfast.setOrder(mmoOrder);
        } else {
            myBreakfast.setOrder(order);
        }
        scanner.close();
        System.out.println("Great, lets confirm your order...");
        myBreakfast.confirmOrder();
    }
}
