package essential.lesson7;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat barsik = new Cat() {
            @Override
            public void voice() {
                System.out.println("Barsik myau myau");
            }
        };
        barsik.voice();

    }
}
