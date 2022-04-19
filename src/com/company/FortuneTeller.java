package com.company;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Hello from the fortune teller");
    }

    private String shoes = "You will get new shoes that will lighten the load";

    private String friend = "Your friend will bring unexpected luck";

    public String getFriend() {
        return friend;
    }

    public String getShoes() {
        return shoes;
    }

    public String tellFortune() {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        while (inputtedNum > 10 || inputtedNum < 0) {
            System.out.println("Hrmm, that number isn't right. Please choose something between 1 and 10");
            inputtedNum = scanner.nextInt();
        }

        String fortune = inputtedNum <= 5 ? getShoes() : getFriend();

        System.out.println(fortune);
        return fortune;
    }
}
