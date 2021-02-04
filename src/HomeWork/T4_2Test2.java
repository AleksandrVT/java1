package HomeWork;

/*Напишите метод, который возвращает текстовую характеристику оценки по числовой.

        0 - не оценено
        1..20 - очень плохо
        21..40 - плохо
        41..60 - удовлетворительно
        61..80 - хорошо
        81..100 - отлично
        в остальных случаях - не определено

        Сигнатура метода static String textGrade(int grade)

        Например, textGrade(45) должна вернуть "удовлетворительно*/
public class T4_2Test2 {
    static String textGrade(int grade) {
        String a = "";

        if (grade == 0) {
            a = "не оценено";
        }
        if (grade >=1 && grade <= 20) {
            a = "очень плохо";
        }
        if (grade >= 21 && grade <= 40) {
            a = "плохо";
        }
        if (grade >= 41 && grade <= 60) {
            a = "удовлетворительно";
        }
        if (grade >= 61 && grade <= 80) {
            a = "хорошо";
        }
        if (grade >= 81 && grade <= 100) {
            a = "отлично";
        } else if (grade >= 100 ){
            a = "не определено";}
        return a;
    }

    public static void main(String[] args) {
        System.out.println( textGrade(0));
        System.out.println(textGrade(5));
        System.out.println(textGrade(25));
    }
}



