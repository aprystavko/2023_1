package essential.lesson4;

public abstract class Bird implements BirdActions {
    public String name;

    public abstract void move();

    public void eat() {
        System.out.println("Bird can eat");
    }
}
