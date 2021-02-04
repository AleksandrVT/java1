package HomeWork;

public class HomeWork_H1 {
    public static void printJava(){
        String a = "Хорошо идут дела";
        String b = "Изучаю Java я!";
        String c = " ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + c + b);
        System.out.println(b + c + a);
    }
    public static void printJava(String java1, String java2){
        System.out.println(java1);
        System.out.println(java2 + "!");
        System.out.println(java1 + ", " + java2 + "!");
        System.out.println(java2 + ", " + java1 + "!");
    }
    public static String plusJava(String message){
        String a = "Java - ";
        String b = " язык программирования";
        String c;
        return c = a + message + b;
    }
    public static void main(String[] args){
        printJava();
        printJava("Чтобы Java понимать", "Надо функции писать");
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");
        String str;
        str = plusJava("самый популярный");
        System.out.println("str = " + plusJava("самый популярный"));
        str = plusJava("объектно-ориентированный");
        System.out.println("str = " + plusJava("объектно-ориентированный"));
        System.out.println(plusJava("очень интересный"));
    }
}
