package lesson6;

import java.util.Scanner;

public class GuessColor {
    public static void main(String[] args) {
        final int MAX_ATTEMPT = 5;
        int attempt = 0;
        String color = "red";

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number in five tries");
        System.out.println("For exit press: exit");

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.print("Attempt: " + attempt + "; Enter color: ");
            String userColor = sc.next();

            if (userColor.equals("exit")) {
                break;
            }
            if (!userColor.equals(color)) {
                continue;
            }

            System.out.println("Congratulations! You are guess the color with " + attempt + "!!!");
            break;
        }
    }
}
