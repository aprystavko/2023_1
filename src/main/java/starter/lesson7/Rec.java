package starter.lesson7;

public class Rec {
    public static void main(String[] args) {
        printRec(10);
        printRec(3);
        printRec(5);
    }

    private static void printRec(int length){
        for (int i = 0; i < length; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
