package learning.java.apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Breakfast {
    private static String[] combo1 = new String[]{"2 eggs", "bacon", "toast"};
    private static String[] combo2 = new String[]{"2 eggs", "sausage", "toast"};
    private static String[] allItems = new String[]{"eggs", "bacon", "sausage", "potatoes", "fruit", "toast"};
    private String order;
    private boolean makeYourOwn;

    Breakfast(boolean makeYourOwn) {

        if (makeYourOwn) {
            setMakeYourOwn(makeYourOwn);
        }
    }

    public void setOrder(String order) {
        if (makeYourOwn) {
            this.order = order;
        }

        if (order.equals("combo1")) {
            this.order = String.join(", ", combo1);
        }

        if (order.equals("combo2")) {
            this.order = String.join(", ", combo2);
        }
    }

    public void confirmOrder() {
        String finalOrder;
        if (makeYourOwn) {
            ArrayList<String> completeOrder = new ArrayList<>(5);
            String[] splitOrder = order.split(",", 5);
            List<String> itemsList = new ArrayList<>(Arrays.asList(allItems));

            for (String item: splitOrder) {
                if (itemsList.contains(item) == true) {
                    completeOrder.add(item);
                }
            }

            finalOrder = String.join(", ", completeOrder);
        } else {
            finalOrder = this.order;
        }

        System.out.println(finalOrder);
    }

    public void setMakeYourOwn(boolean makeYourOwn) {
        this.makeYourOwn = makeYourOwn;
    }

    public static void readItems() {
        System.out.println("Combo 1: " + String.join(", ", combo1));
        System.out.println("Combo 2: " + String.join(", ", combo2));
        System.out.println("Make your own from: " + String.join(", ", allItems));
    }
}
