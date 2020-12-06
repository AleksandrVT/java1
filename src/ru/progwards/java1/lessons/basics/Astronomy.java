package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double π = 3.14;

    public static Double sphereSquare(Double r) {
        double S;
        S = 4 * π * r * r;
        return S;
    }
    public static Double earthSquare() {
        double S = sphereSquare(6371.2);
        return S;
    }

    public static Double mercurySquare() {
        double S = sphereSquare(2439.7);
        return S;
    }

    public static Double jupiterSquare() {
        double S = sphereSquare(71492.0);
        return S;
    }

    public static Double earthVsMercury() {
        double v = earthSquare() / mercurySquare();
        return v;
    }

    public static Double earthVsJupiter() {
        double v = earthSquare() / jupiterSquare();
        return v;
    }

    public static void main(String[] args) {
        earthSquare();
        System.out.println(earthSquare());
        mercurySquare();
        System.out.println(mercurySquare());
        jupiterSquare();
        System.out.println(jupiterSquare());
        earthVsMercury();
        System.out.println(earthVsMercury());

    }
}

