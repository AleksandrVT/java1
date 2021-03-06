package ru.progwards.java1.lessons.compare_if_cycles;

/*3.1 Реализовать функцию
public static boolean containsDigit(int number, int digit), которая будет возвращать true,
        если число number содержит цифру digit.

        Теперь проведём исследование. Есть ли у Золотого треугольника связь с числами Фибоначчи.
        Золотой треугольник это равнобедренный треугольник у которого ребро относится
        к основанию как 1.61803 (приблизительно), то есть по правилу Золотого сечения.
        Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ... в котором
        первые два элемента равны 1, а каждый следующий равен сумме двух предыдущих.
        Для проведения этого исследования нам придётся решить две задачи.

        3.2 Реализовать, используя любой цикл, функцию
public static int fiboNumber(int n), которая будет возвращать n-ое число Фибоначчи
        (нумерация начинается с 1, то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).
        3.3 Реализовать функцию
public static boolean isGoldenTriangle(int a, int b, int c), которая будет возвращать true,
        если треугольник со сторонами a, b, c является Золотым. Определим критерии.
        Он должен быть равнобедренным и отношение ребра к основанию должно лежать
        между значениями 1.61703 и 1.61903.
        Далее в функции public static void main(String[] args) вывести на консоль,
        используя цикл, 15 первых чисел Фибоначчи. После этого, используя вложенные
        циклы, определить: есть ли среди треугольников, длины сторон которых являются
        натуральными числами Фибоначчи не превышающими 100, Золотые треугольники. Таким
        образом одно число Фибоначчи является одной парой сторон треугольника, а следующее
        является снованием. И если найдены Золотые треугольники, вывести на консоль длины основания и
        рёбер этих треугольников.
        Если всё получилось, посмотрите на консоль и сделайте вывод: есть ли связь между числами Фибоначчи и
        Золотыми треугольниками.*/


public class CyclesGoldenFibo {
    static final double V1 = 1.61703;
    static final double V2 =  1.61903;
    public static boolean containsDigit(int number, int digit) {
        if (number == 0 && digit == 0) {
            return true;
        }
        for (; number > 0; ) {
            if ((number % 10) == digit) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
    public static int fiboNumber(int n){
        if (n<3) {
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int fibo = 0;
        for (int i = 2; i <= n; i++) {
            fibo = n1 + n2;
            n1 = n2;
            n2 = fibo;
        }
        return fibo;
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        int side_bok = 0;
        int side_osnov = 0;
        if (TriangleInfo.isIsoscelesTriangle(a, b, c) == false)
            return false;
        if (a == b) {
            side_bok = a;
            side_osnov = c;
        }
        if (a == c) {
            side_bok = a;
            side_osnov = b;
        }
        if (c == b) {
            side_bok = c;
            side_osnov = a;
        }
        double difference = (double) side_bok / side_osnov;
        boolean gold = difference >= V1 && difference <= V2;
        return gold;
    }
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.println(fiboNumber(i));
        }
        for (int i = 1; i <= 100; i++)
            for (int j = 1; j <= 100; j++)
                if (isGoldenTriangle(j, j, i))
                    System.out.println("Основание = " + i + "сторона = " + j);
    }
}


