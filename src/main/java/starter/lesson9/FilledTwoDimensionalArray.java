package starter.lesson9;

public class FilledTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.print("\n");
        }

    }
}
