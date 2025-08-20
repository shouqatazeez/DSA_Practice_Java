package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = { 10, 49, 59, 39, 20 };
        swapp(arr, 4, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void swapp(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
