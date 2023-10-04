package essential.lesson3;

public class Cat extends Animal{
    public String owner;

    public static void main(String[] args) {
        Cat barsik = new Cat();
        Cat cat = new Cat();
        Animal an1 = new Cat();

        an1.makeSound();

        barsik.name = "Barsik";
        System.out.println(barsik.name);
        barsik.makeSound();
        barsik.catSound();
    }

    public void catSound(){
        System.out.println("Myauuu");
    }
}

