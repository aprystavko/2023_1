package starter.lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        Lesson8 les = new Lesson8();
        les.over();
        les.over("Hi");
        les.over(8);
    }
    void over(){
        System.out.println("Method without params");
    }

    void over(String value){
        System.out.println(value);
    }

    void over(int value){
        System.out.println(value);
    }

}
