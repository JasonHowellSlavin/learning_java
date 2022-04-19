package com.company;
import java.util.Scanner;
import java.lang.Math;

public class LearningFunctions {
    public static void main(String[] args) {
    }

    public void announceTeaTime() {
        System.out.println("Waiting for tea time...");
        System.out.println("You tell me when!");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Tea time!");
    }

    public Number calculateMealPrice(double price, double tipRate, double taxRate) {
        double tip = tipRate * price;
        double tax = taxRate * price;
        return price + tax + tip;
    }

    public Number salaryCalculator(int pricePerHour,
                                   int hoursPerWeek,
                                   int numVacationWeeks,
                                   boolean paidVacation) {
        int vacation = paidVacation ? 0 : numVacationWeeks;
        return pricePerHour * (hoursPerWeek * (52 - vacation));
    }
}
