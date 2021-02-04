package HomeWork;

public class T4_31Test3 {
    static long factorial(long n) {
        long rezult = 1;
        int i = 1;
        while (i <= n) {
            rezult = rezult * i;
            i++;
        }
        return rezult;
    }

    public static void main(String[] args) {
        factorial (3);
        System.out.println(factorial (3));
    }
}
