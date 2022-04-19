package com.company;

public class StudentProfile {
    static int unitsRequiredToGraduate = 128;

    String firstName;
    String lastName;
    double GPA;
    int yearEnrolled;
    String declaredMajor;
    double avgUnitsCompleted;
    int totalSemesters;
    private int currentCompletedUnits;
    private long yearExpectedToGraduate;
    private double semestersUntilGraduation;

    public StudentProfile(String firstName, String lastName,
                          double GPA, int yearEnrolled,
                          String declaredMajor,
                          int totalSemesters, int currentCompletedUnits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.yearEnrolled = yearEnrolled;
        this.declaredMajor = declaredMajor;
        this.totalSemesters = totalSemesters;
        this.currentCompletedUnits = currentCompletedUnits;
        this.avgUnitsCompleted = currentCompletedUnits / totalSemesters;
        this.semestersUntilGraduation = semestersUntilGraduation();
        this.yearExpectedToGraduate = calculateGraduatingYear();
    }

    private double semestersUntilGraduation () {
        double unitsLeft = unitsRequiredToGraduate - currentCompletedUnits;
        return unitsLeft / avgUnitsCompleted;
    }

    private double yearsUntilGraduation () {
        return semestersUntilGraduation() / 2;
    }

    private long calculateGraduatingYear() {
        return Math.round(yearEnrolled + yearsUntilGraduation());
    }

    public void incrementYearToGraduate() {
        this.yearExpectedToGraduate = this.yearExpectedToGraduate + 1;
    }

    public void addUnits(int units) {
        this.currentCompletedUnits = this.currentCompletedUnits + units;
        this.yearExpectedToGraduate = calculateGraduatingYear();
    }

    public void produceRecord() {
        System.out.println("First: " + firstName + " Last:" + lastName);
        System.out.println("Declared Major: " + declaredMajor);
        System.out.println("Year enrollde: " + yearEnrolled + " Expected to graduate in: " + yearExpectedToGraduate);
        System.out.println("GPA: " + GPA);
        System.out.println("Total Semesters: " + totalSemesters + ", Avg Units Completed: " + currentCompletedUnits);
    }
}
