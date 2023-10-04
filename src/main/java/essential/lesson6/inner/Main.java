package essential.lesson6.inner;

class MyClass {
    public class Inner extends ClassTwo {
        public void printFromInnerClass() {
            System.out.println("Inner Class printing");
            Inner instance = new Inner();
            instance.printFromClassTwo();
        }
    }
}

public class Main extends ClassOne {
    public static void main(String[] args) {

        MyClass.Inner instance = new MyClass().new Inner();
        instance.printFromInnerClass();

        Main instanceOne = new Main();
        instanceOne.printFromClassOne();
    }
}
