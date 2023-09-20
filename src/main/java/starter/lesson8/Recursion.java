package starter.lesson8;

public class Recursion {
    public static void main(String[] args) {
        rec(13);
    }
    static void rec(int value){
        value--;

        if(value != 0) {
            System.out.println(value);
            rec(value);
        }

    }
}
