package essential.lesson8;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Example {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new CustomException("Age cannot be negative");
            }
            System.out.println("Age is valid: " + age);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
