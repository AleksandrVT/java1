package AVT1;

public class Ostatok {
    public static double fractional(double num){
        double a = 1;
        return  num % a;
    }
    public static void main(String[] args){
        System.out.println(fractional(1.53));
    }
}
