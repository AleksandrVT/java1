package ru.progwards.java1.lessons.compare_if_cycles;
/*1.1 Реализовать функцию
public static int maxSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
а вернуть должна наибольшую длину стороны.
  1.2 Реализовать функцию
public static int minSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
 а вернуть должна наименьшую длину стороны.
1.3 Реализовать функцию
public static boolean isEquilateralTriangle(int a, int b, int c), которая получает параметрами длины сторон треугольника,
 а вернуть должна true, если треугольник равносторонний и false в противном случае
        Рекомендации к тестированию: проверьте isEquilateralTriangle с параметрами
        2, 2, 3
        2, 3, 2
        3, 2, 2
        2, 2, 2
        3, 3, 3
        Обязательно протестируйте остальные методы, вызвав из из функции main*/
public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {

        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >=c)
            return b;
        else
            return c;
    }

    public static int minSide(int a, int b, int c) {
        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else
            return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == b && b == c)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        maxSide(2, 2, 3);
        maxSide(2, 3, 2);
        maxSide(3, 2, 2);
        maxSide(2, 2, 2);
        maxSide(3, 3, 3);
        System.out.println(maxSide(2, 2, 3));
        System.out.println(maxSide(2, 3, 2));
        System.out.println(maxSide(3, 2, 2));
        System.out.println(maxSide(2, 2, 2));
        System.out.println(maxSide(3, 3, 3));
        System.out.println(minSide (2, 2, 3));
        System.out.println(minSide (2, 3, 2));
        System.out.println(minSide (3, 2, 2));
        System.out.println(minSide (2, 2, 2));
        System.out.println(minSide (3, 3, 3));
        System.out.println(isEquilateralTriangle(2,2,3));
        System.out.println(isEquilateralTriangle(2,3,2));
        System.out.println(isEquilateralTriangle(3,2,2));
        System.out.println(isEquilateralTriangle(2,2,2));
        System.out.println(isEquilateralTriangle(3,3,3));
    }
}
