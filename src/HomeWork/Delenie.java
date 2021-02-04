package HomeWork;

public class Delenie {
    public static void main(String[] args) {
        final double DAYS_IN_YEAR = 365;
        final byte DAYS_IN_WEEK = 7;

        double weekInYear = DAYS_IN_YEAR / DAYS_IN_WEEK;
        System.out.println("Недель в году: ");
        System.out.println(weekInYear);
    }
}
