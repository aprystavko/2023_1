package lesson5;

public class Cyber {
    static int secretKey = 0b1010101011111111;

    public static void main(String[] args) {
        char character = 'A';
        System.out.println("Value before XOR: " + character);
        int xorCharacter = character ^ secretKey;
        System.out.println("Value after XOR: " + (char) xorCharacter);
        System.out.println("The first value: " + (char) (xorCharacter ^ secretKey));

        System.out.println(" ");
        String phrase = "Hello Cyber!";
        System.out.println("Original string before XOR: " + phrase);

        System.out.print("String after XOR: ");
        char[] phraseAfterXor = addToArray(phrase);
        for (int i = 0; i < phraseAfterXor.length; i++) {
            System.out.print(phraseAfterXor[i]);
        }

        System.out.println(" ");
        System.out.print("String after decode: ");
        for (int i = 0; i < phraseAfterXor.length; i++) {
            System.out.print( (char)((short)phraseAfterXor[i] ^ secretKey) );
        }
    }

    private static char codeValue(char value, int secretKey) {
        return (char) (value ^ secretKey);
    }

    static char[] addToArray(String value) {
        char[] valueArray = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            assert false;
            valueArray[i] = codeValue(value.charAt(i), secretKey);
        }
        return valueArray;
    }

}