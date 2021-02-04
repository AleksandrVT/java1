package HomeWork;

/*Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)

        Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1*/

public class T4_3Test3 {
    static long factorial(long n) {
        long rezult = 1;
        for (int i = 1; i <= n; i++) {
            rezult = rezult * i;
        }
        return rezult;
    }

    public static void main(String[] args) {
        T4_3Test3.factorial(5);
        System.out.println(factorial(5));
    }
}
