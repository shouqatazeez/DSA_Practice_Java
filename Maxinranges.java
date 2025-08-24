
public class Maxinranges {

    public static void main(String[] args) {

        int[] arr = { 14, 69, 34, 33, 556, 63 };

        System.out.println(maxrange(arr, 1, 4));

    }

    static int maxrange(int[] arr, int start, int end) {
        int max = arr[start];// here we declare the max value as the array start value like wise arr[start]

        for (int i = start; i <= end; i++) { // then the value i start from the start i.e arr[1] and moved till like
                                             // wise the given end value <= end

            if (arr[i] > max) {// it check each and every value in the array is greater than then the max

                max = arr[i];
            }

        }

        return max;

    }
}
