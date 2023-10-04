package essential.lesson6;

public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass();
        System.out.println(instance.name);
        System.out.println(NotStaticClass.age);
        System.out.println(NotStaticClass.weight);
    }
}
