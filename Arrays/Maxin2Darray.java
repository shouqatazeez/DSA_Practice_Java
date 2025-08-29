package Arrays;

public class Maxin2Darray {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 9, 3 },
                { 2, 4, 5 },

                { 23, 45 } };

        int result = maxvalue(arr);
        System.out.println(result);

    }

    static int maxvalue(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];

                }

            }
        }

        return max;
    }

}
