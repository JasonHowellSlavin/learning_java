package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello from the IDE");

	    //Class instance of StudentInfo
        StudentInfo student = new StudentInfo();
        //Class instance of Fortune Teller
        FortuneTeller teller = new FortuneTeller();
        // Class instance of functions
        LearningFunctions myFunc = new LearningFunctions();
        // Class instance of Triangle
        Triangle triangle = new Triangle(2, 3);
        // Class instance of StudentProfile
        StudentProfile studentA = new StudentProfile("Jason","Slavin",
                3.4, 2018,
                "Art", 4, 48);
        StudentProfile studentB = new StudentProfile("Alex", "Ford",
                4.0, 2018,
                "English",4, 60);

        studentA.produceRecord();
        studentB.produceRecord();

        studentA.addUnits(24);
        studentA.produceRecord();
    }
}
