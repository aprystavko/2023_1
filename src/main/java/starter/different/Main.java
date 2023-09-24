package starter.different;

public class Main {
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Создайте экземпляр класса MyClass
        Main myObject = new Main();

        // Вызовите нестатический метод на созданном экземпляре
        myObject.nonStaticMethod();
    }
}

