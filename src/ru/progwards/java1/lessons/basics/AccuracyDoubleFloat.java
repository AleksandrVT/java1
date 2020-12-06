package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius) {
        double π = 3.14;
        double V = 4.0 / 3.0 * (π * radius * radius * radius);
        return V;
    }
    public static float volumeBallFloat(float radius) {
        float π = 3.14f;
        float V = 4.0f / 3.0f * (π * radius * radius * radius);
        return V;
    }
    public static double calculateAccuracy(double radius) {
        float radius1 = (float)radius;
        return volumeBallDouble (radius) - volumeBallFloat (radius1);
    }

    public static void main(String[] args) {
        volumeBallDouble (6371.2);
        volumeBallFloat (6371.2f);
        calculateAccuracy (6371.2);
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy (6371.2));
    }
}
