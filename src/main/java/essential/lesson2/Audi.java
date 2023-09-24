package essential.lesson2;

public class Audi extends Car {
    public Audi(int speed, int price, String model) {
        super(speed, price, model);
    }
    public static void main(String[] args) {
        Car audi = new Car(220, 15000, "e-tron GT");
        System.out.println(audi);
        System.out.println("Price: " + audi.getPrice() + "\nMax speed: " + audi.getSpeed() + "\nModel: "
                + audi.getModel());
        audi.sound();
    }
}
