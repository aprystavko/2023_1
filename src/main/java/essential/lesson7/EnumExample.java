package essential.lesson7;

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today " + today.getName());

        for (Day day : Day.values()) {
            System.out.println(day.getName() + " (value: " + day.getValue() + ")");
        }
    }
}
