
package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    int len, n;
    try (Scanner stdIn = new Scanner(System.in)) {
      do {
        System.out.print("length of an Array: ");
        len = stdIn.nextInt();
      } while (len <= 0);

      int[] nums = new int[len];
      for (int i = 0; i < len; i++) {
        System.out.printf("nums[%d]: ", i);
        n = stdIn.nextInt();
        nums[i] = n;
      }

      for (int i = 0; i < len / 2; i++) {
        swap(nums, i, len - 1 - i);
      }

      System.out.println(Arrays.toString(nums));

      //
    }
  }

  static void swap(int[] nums, int a, int b) {
    int tmp = nums[a];
    nums[a] = nums[b];
    nums[b] = tmp;
  }
}
