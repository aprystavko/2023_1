package lesson4;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        String login = "Alex";
        String password = "Password";
        Scanner sc = new Scanner(System.in);

        System.out.print("Input login: ");
        String userLogin = sc.next();

        if (login.equals(userLogin)) {
            System.out.print("Input Password: ");
            String userPassword = sc.next();
            if (password.equals(userPassword)) {
                System.out.print("Authentication is successful");
            } else {
                System.out.print("Wrong credentials");
            }
        } else {
            System.out.print("Wrong credentials");
        }

    }
}