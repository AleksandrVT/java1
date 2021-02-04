package HomeWork;

public class HelloBay {
    public static void hellobay(String name) {
        System.out.println("- Здравствуй, " + name + "!");
        System.out.println("- Здравствуй, колобок!");
        System.out.println("- До свидания, " + name + "!");
        System.out.println("- До свидания, колобок!");
    }

    public static void main(String[] args) {
        System.out.println("Идёт по лесу колобок, а навстречу ему три богатыря.");
        hellobay("Илья Муромец");
        hellobay("Добрыня Никитич");
        hellobay("Алёша Попович");
        System.out.println("Идёт колобок дальше.");
        System.out.println("Навстречу ему Али-баба и 40 разбойников.");
        System.out.println("- Здравствуй, Али-баба");
        System.out.println("- Иди лесом, колобок, мы торопимся.....");
    }
}
