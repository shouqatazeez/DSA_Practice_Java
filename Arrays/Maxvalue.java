package Arrays;

public class Maxvalue {
    public static void main(String[] args) {

        int[] arr = { 100, 45, 2700, 12, 38 };
        System.out.println(maxvalue(arr));

    }

    static int maxvalue(int[] arr) {
        int max = arr[0];// here we consider the arr[0] as the max value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {// then after we check whether the array values in the array is greater thant
                               // the max value

                max = arr[i];

            }
        }

        return max;
    }
}
