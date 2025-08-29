package Arrays;

import java.util.Arrays;

public class search2Darray {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 9, 3 },
        { 2, 4, 5 },

        { 23, 45 }
    };

    int target = 2;

    int[] ans = two(arr, target);
    System.out.println(Arrays.toString(ans));
  }

  static int[] two(int[][] arr, int target) {

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {

        if (arr[row][col] == target) {
          return new int[] { row, col };
        }
      }
    }

    return new int[] { -1, -1 };

  }
}
