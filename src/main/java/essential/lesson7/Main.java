package essential.lesson7;

public class Main {
    public static void main(String[] args) {

        MyInterface anonymousClass = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Call doSomething from anonymous class");
            }
        };

        anonymousClass.doSomething();
    }
}
