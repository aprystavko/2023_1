package starter.lesson9;

public class MinMaxArrayValue {
    public static void main(String[] args) {
        int[] array = {-1, 0, 3, 125, 189, -2, -10, 15, 244, -325, 123};
        System.out.println(minArrayValue(array));
        System.out.println(maxArrayValue(array));
    }

    static int minArrayValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int maxArrayValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}
