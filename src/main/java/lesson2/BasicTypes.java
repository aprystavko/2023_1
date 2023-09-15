package lesson2;

public class BasicTypes {
    public static void main(String[] args) {
        byte b = 2;
        System.out.println(b + " - It is byte type of the variable");

        short c = 256;
        System.out.println(c + " - It is short type of the variable");


        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long max = 1444444444444444444L;
        long max1 = 9223372036854775807L;

        System.out.println(Long.MAX_VALUE);

        System.out.println(Long.compare(max1, Long.MAX_VALUE)-900);

    }
}
