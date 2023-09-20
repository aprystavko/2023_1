package starter.scanner;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input integer value: ");
        int intValue = sc.nextInt();

        System.out.println("Input double value: ");
        double doubleValue = sc.nextDouble();

        System.out.println("Input string with spaces: ");
        String stringValue = sc.next();

        System.out.println("Input string: ");
        String stringValue1 = sc.nextLine();

        System.out.println(intValue + "\n" + doubleValue + "\n" + stringValue + "\n" + stringValue1 + "\n");
        System.out.println(stringValue1);

    }
}
