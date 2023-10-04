package essential.lesson3;

public class Main {

    public static void main(String[] args) {
        DivideClass instance = new DivideClass();
        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;
        instance.field4 = 4;
        instance.field5 = 5;

        BaseClass newInstance = (BaseClass) instance;

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);
//        System.out.println(newInstance.field4);
//        System.out.println(newInstance.field5);

    }
}
