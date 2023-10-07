package essential.lesson10.withGen;

public class WinGen<T> {
    T obj;

    public WinGen(T obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj);
    }
}