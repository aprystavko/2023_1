package essential.lesson2;

public class Pet {
    private int age;
    private String name;
    public Pet(int age, String name) {
        age = age;
        name = name;
    }
    public static void main(String[] args) {
        Pet cat = new Pet(5,"Murka");
        System.out.println(cat.age + " " + cat.name);
    }
}
