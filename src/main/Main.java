
package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    int input, base;
    try (Scanner stdIn = new Scanner(System.in)) {
      do {
        System.out.print("number to convert: ");
        input = stdIn.nextInt();
        System.out.print("base : ");
        base = stdIn.nextInt();
      } while (input <= 0 && base <= 0);

      String result = convert(input, base);
      System.out.println(result);

      //
    }
  }

  static String convert(int input, int base) {
    char[] chars = "0123456789abcdef".toCharArray();
    String tmp = "";
    do {
      tmp = chars[input % base] + tmp;
      input /= base;

    } while (input != 0);
    return tmp;
  }

  static void swap(int[] nums, int a, int b) {
    int tmp = nums[a];
    nums[a] = nums[b];
    nums[b] = tmp;
  }
}
