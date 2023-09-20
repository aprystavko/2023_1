package starter.lesson9;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int length = 3, width = 3;
        int[][] arr = new int[length][width];
        int counter = 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = counter;
                counter++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
