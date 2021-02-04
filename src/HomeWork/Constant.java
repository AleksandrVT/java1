package HomeWork;

public class Constant {
    public static final int DAYS_IN_WEEK = 7;
    private static final int HOURS_IN_DAY = 24;
    static final int MINUTES_IN_HOUR = 60;
    static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        final int SECONDS_IN_MINUTE = 60;

        System.out.println("Секунд в сутках: ");
        System.out.println(HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE);
        System.out.println("Секунд в неделе: ");
        System.out.println(DAYS_IN_WEEK * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE);
        System.out.println("Секунд в часе: ");
        System.out.println(SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
    }
}
