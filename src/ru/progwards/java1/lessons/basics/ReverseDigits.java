package ru.progwards.java1.lessons.basics;


public class ReverseDigits{
    public static int reverseDigits(int number){
        int a = (number % 10) * 100;
        number /= 10;
        int b = (number % 10) * 10;
        number /= 10;
        return  a + b + number;
    }
    public static void main(String[] args){
        reverseDigits(123);
        System.out.println(reverseDigits(123));
        reverseDigits(456);
        System.out.println(reverseDigits(456));
        reverseDigits(789);
        System.out.println(reverseDigits(789));
    }
}


