package essential.lesson2;

public class Car {
    private int speed;
    private int price;
    private String model;

    public Car(int speed, int price, String model) {
        this.speed = speed;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public void sound(){
        System.out.println("beep beep");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
