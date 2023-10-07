package essential.lesson10.withGen;

public class Main {
    public static void main(String[] args) {
        WinGen<String> w1 = new WinGen<>("Hello cruel world");
        WinGen<Integer> w2 = new WinGen<>(10);
        WinGen<Cat> w3 = new WinGen<>(new Cat("Murka"));
        w1.display();
        w2.display();
        w3.display();
    }




}
