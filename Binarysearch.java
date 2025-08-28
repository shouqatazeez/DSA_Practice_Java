public class Binarysearch {
    public static void main(String[] args) {

    }

    static int binarysearch(int[] arr, int target, int s, int e) {
        if (arr.length == -1) {
            return -1;

        }
        int mid = s + e / 2;

        for (int i = 0; i < arr.length - 1; i++) {
            if (target == mid) {

                return mid;

            }

            if (arr[i] > mid) {

            }

        }

    }

}
