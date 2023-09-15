package different;

public class Different {
    public static void main(String[] args) {


        System.out.println("==============");
        int a =6, b = 4;
        a = ++a + b++ + a++; // 7 + 4 + 6 = 18
        int c = --a + b--;  // 17 + 5 = 22
        System.out.println(a + " " + b + " " + c); //  17, 4, 20
    }
}
