package HomeWork;

public class Obiom {
    public static double volumeBallDouble(double radius) {
        double π = 3.14;
        double V = (π * radius * radius * radius) * 4 / 3;
        return V;
    }

    public static void main(String[] args) {
        volumeBallDouble (1);
        System.out.println(volumeBallDouble (1));
    }
}
