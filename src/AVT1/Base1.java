package AVT1;

public class Base1 {
    public static void printJava(){
        String str1 = "Хорошо идут дела";
        String str2 = "Изучаю java я!";
        String str3 = " ";
        System.out.println(str1);
        System.out.println(str2);
        System.out.print(str1);
        System.out.print(str3);
        System.out.println(str2);
        System.out.print(str2);
        System.out.print(str3);
        System.out.println(str1);
    }
    public static void printJava(String java1, String java2){
        System.out.println(java1);
        System.out.println(java2 + "!");
        System.out.print(java1);
        System.out.print(", ");
        System.out.println(java2 + "!");
        System.out.print(java2 + ",");
        System.out.println(java1 + "!");
    }
    public static String plusJava(String message){
        String s = "Java - " + message + " язык программирования";
        return s;
    }
    public static void main(String[] args){
        printJava();
        printJava("Чтобы Java понимать", "Надо функции писать");
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");
        String str;
        str = "Java - самый популярный язык программирования";
        System.out.println("str = " + str);
        str = "Java - объектно-ориентированный язык программирования";
        System.out.println("str = " + str);
        System.out.println("Java - очень интересный язык программирования");
    }
}
