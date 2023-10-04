package essential.lesson3.bird;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.move();

        Straus straus = new Straus();
        straus.move();

        System.out.println("=======");

        Bird p = new Penguin();
        Bird s = new Straus();
        Bird [] arr = {s, p};
        for (Bird temp: arr){
            temp.move();
        }
    }
}
