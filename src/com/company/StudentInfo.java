package com.company;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

    }
    //Refrence Type String
    private static String firstName = "Adam";
    private static String lastName = "Bazz";

    // Primitive Types
    public static int studentAge = 15;
    public static double studentGPA = 3.45;
    public char studentFirstInitial = firstName.charAt(0);
    public char studentLastInitial = lastName.charAt(0);
    public static boolean hasGoodAttendance = true;

    public static void changeGPA() {
        System.out.println("Change GPA from " + studentGPA + " to...");

        // I/O in Java (Scanner is aditional data type)
        Scanner input = new Scanner(System.in);
        double newStudentGPA = input.nextDouble();

        System.out.println(getFirstName() + " " + getLastName() + ": GPA: " + newStudentGPA);
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }
}
