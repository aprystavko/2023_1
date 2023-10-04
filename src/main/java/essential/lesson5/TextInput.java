package essential.lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text values. For exit enter \"exit\" : ");
        ArrayList<String> values = new ArrayList<>();

        while(true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            values.add(input);

        }
        sc.close();

        System.out.println(values);
        System.out.println("remove value 0");
        values.remove(0);
        System.out.println(values);

        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            String print = iterator.next();
            System.out.println(print);
        }
    }

}
