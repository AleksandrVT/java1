package AVT1;

public class Base2 {
    public static final String X_EQUALS = "x = ";
    public static final String Y_EQUALS = "y = ";
    public static final String A_EQUALS = "a = ";
    public static final String B_EQUALS = "b = ";
    public static final String C_EQUALS = "c = ";

    public static int subtraction(int x, int y) {
        System.out.println("Вызвана функция subtraction() с параметрами");
        System.out.println(X_EQUALS + x + ", " + Y_EQUALS + y);
        return  x - y;
    }
    public static int addition(int x, int y) {
        System.out.print("Вызвана функция addition() с параметрами ");
        System.out.println(X_EQUALS + x + ", " + Y_EQUALS + y);
        return x + y;
    }
    public static int multiplication(int x, int y) {
        System.out.print("Вызвана функция multiplication() с параметрами ");
        System.out.println(X_EQUALS + x + ", " + Y_EQUALS);
        return x * y;
    }
    public static void calculation(){
        int a = 34;
        int b = 55;
        int c;
        System.out.println(A_EQUALS + a);
        System.out.println(B_EQUALS + b);
        c = addition(a,b);
        System.out.println("a + b = " +c);
        c = subtraction(a,b);
        System.out.println("a - b = " + c);
        c = multiplication(a,b);
        System.out.println("a * b = " + c);
    }
    public static void calculation(int a, int b, int c) {
        System.out.print("Вызвана функция calculation() с параметрами ");
        System.out.println(A_EQUALS + a + ", " + B_EQUALS + b + ", " + C_EQUALS + c);
        System.out.println("a + b + c = " + addition(addition(a,b),c));
        System.out.println("a^3 = " + multiplication(multiplication(a,a),a));
        System.out.println("a - (b + c^2) = " + subtraction(a,addition(b,multiplication(c,c))));
    }
    public static void main(String[] args){
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
        calculation();
        calculation(11,25,410);
        calculation(100,9,98);
    }
}

