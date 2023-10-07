package essential.lesson9;

public class Equals {


    public static void main(String[] args) {
        String strOne = "Hello";
        String strTwo = "Hello";
        System.out.println(strOne == strTwo);
        System.out.println(strOne.hashCode());
        System.out.println(strTwo.hashCode());

        strOne = strOne + 1;
        strTwo = strTwo + 1;
        System.out.println(strOne == strTwo);
        System.out.println(strOne.hashCode());
        System.out.println(strTwo.hashCode());

        Equals instance = new Equals();
        System.out.println(instance.toString());
        System.out.println(instance.hashCode());
        System.out.println(instance.getClass());

    }
}
