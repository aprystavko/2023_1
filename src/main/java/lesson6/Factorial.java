package lesson6;

public class Factorial {
    public static void main(String[] args) {
        long counter = 5;
        long factorial = 1;

        do {
            factorial = factorial * counter;
            counter--;
        } while ( counter > 0);
        System.out.println("Factorial = " + factorial);
    }
}
