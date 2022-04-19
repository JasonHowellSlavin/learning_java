package com.company;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    private double calculateHypatonuse(double a, double b) {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = calculateHypatonuse(sideA, sideB);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
