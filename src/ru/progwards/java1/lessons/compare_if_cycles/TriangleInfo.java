package ru.progwards.java1.lessons.compare_if_cycles;
/*2.1 Реализовать функцию
public static boolean isTriangle(int a, int b, int c), которая возвращает true,
если по данным трём сторонам (a, b, c) можно построить треугольник. Из геометрии известно,
что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
        2.2 Реализовать функцию
public static boolean isRightTriangle(int a, int b, int c), которая возвращает true,
 если треугольник со сторонами a, b, c является прямоугольным. Из геометрии известно,
 что для прямоугольного треугольника выполняется теорема Пифагора (сумма квадратов катетов равна квадрату гипотенузы).
        2.3 Реализовать функцию
public static boolean isIsoscelesTriangle(int a, int b, int c), которая возвращает true,
если треугольник со сторонами a, b, c является равнобедренным. Из геометрии известно,
что в равнобедренном треугольнике есть две равные стороны.

        Рекомендации к тестированию:
        проверьте isTriangle с параметрами
        2, 2, 3
        2, 3, 4
        3, 2, 5
        2, 3, 6
        3, 3, 9
        проверьте isIsoscelesTriangle с параметрами
        2, 2, 3
        2, 3, 2
        3, 2, 2
        2, 2, 2
        3, 3, 3

        Обязательно протестируйте остальные методы, вызвав из из функции main*/

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
            return true;
        else
            return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b || a == c || b == c)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        isTriangle (2,2,3);
        isTriangle (2,3,4);
        isTriangle (3,2,5);
        isTriangle (2,3,6);
        isTriangle (3,3,9);
        isRightTriangle (2,2,3);
        isRightTriangle (2,3,4);
        isRightTriangle (3,2,5);
        isRightTriangle (2,3,6);
        isRightTriangle (3,3,9);
        isRightTriangle (2,2,3);
        isIsoscelesTriangle (2,2,3);
        isIsoscelesTriangle (2,3,2);
        isIsoscelesTriangle (3,2,2);
        isIsoscelesTriangle (2,2,2);
        isIsoscelesTriangle (3,3,3);
        System.out.println(isTriangle (2,2,3));
        System.out.println(isTriangle (2,3,4));
        System.out.println(isTriangle (3,2,5));
        System.out.println(isTriangle (2,3,6));
        System.out.println(isTriangle (3,3,9));
        System.out.println(isRightTriangle (2,2,3));
        System.out.println(isRightTriangle (2,3,4));
        System.out.println(isRightTriangle (3,2,5));
        System.out.println(isRightTriangle (2,3,6));
        System.out.println(isRightTriangle (3,3,9));
        System.out.println(isIsoscelesTriangle (2,2,3));
        System.out.println(isIsoscelesTriangle (2,3,2));
        System.out.println(isIsoscelesTriangle (3,2,2));
        System.out.println(isIsoscelesTriangle (2,2,2));
        System.out.println(isIsoscelesTriangle (3,3,3));
    }
}
