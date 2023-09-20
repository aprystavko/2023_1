package starter.lesson9;

public class Arrays {
    public static void main(String[] args) {
        System.out.println(args[0]);

        Arrays arrays = new Arrays();
        System.out.println(arrays);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        int array1[] = new int[3];
        int []array2 = new int[3];
        int []array3 = new int[] {1, 2, 3};
        int []array4 = {1, 2, 3};

    }
}
