package HomeWork;

public class DelenieOstatok {
    public static double delenieOstatok (double a) {
        double n = a % 10;
        return n;
    }

    public static void main(String[] args) {
        delenieOstatok (139.255674);
        System.out.println(delenieOstatok (139.255674));
    }
}
