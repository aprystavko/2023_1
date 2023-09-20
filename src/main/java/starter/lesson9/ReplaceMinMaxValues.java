package starter.lesson9;

import java.util.Random;

public class ReplaceMinMaxValues {

    public static void main(String[] args) {
        Random random = new Random();
        int min = -300;
        int max = 300;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        System.out.println("Array before changes: ");
        for (int j : array) {
            System.out.print(j + " ");
        }

        int[] newArray = replaceMinMaxValues(array);
        System.out.println("\n" + "Array after changes: ");
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }

    static int[] replaceMinMaxValues(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
                minIndex = j;
            }
        }

        System.out.print("\n" + "Min value in array: array[" + minIndex  + "] = " + array[minIndex]);
        System.out.print("\n" + "Max value in array: array[" + maxIndex + "] = " + array[maxIndex]);
        int a = max;
        int b = min;
        int temp = a;
        b = temp;
        array[maxIndex] = min;
        array[minIndex] = max;
        return array;
    }
}
