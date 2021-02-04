package HomeWork;

public class T4_1 {
    static int addAsStrings(int n1, int n2){
       String a = "" + n1 + "" + n2;
       System.out.println(a);
       return Integer.parseInt(a);
    }
    public static void main(String[] args) {
        addAsStrings(1,2);
        addAsStrings(2,1);

    }
}
