package Arrays;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 45, 67, 75 };
        int result = (linearsearch(arr, 45));
        System.out.println(result);
    }

    static int linearsearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}