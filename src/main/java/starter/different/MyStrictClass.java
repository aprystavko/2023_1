package starter.different;

public class MyStrictClass {
    public double performStrictCalculations() {
        double result = 10.0 / 3.0;
        return result;
    }

    public static void main(String[] args) {
        MyStrictClass myStrictClass = new MyStrictClass();
        System.out.println(myStrictClass.performStrictCalculations());
    }
}
