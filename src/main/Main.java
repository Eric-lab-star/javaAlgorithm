
package main;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    int n;
    try (Scanner stdIn = new Scanner(System.in)) {
      do {
        System.out.print("size of triangle: ");
        n = stdIn.nextInt();
      } while (n <= 0);
      int base = (n - 1) * 2 + 1;

      for (int x = 1; x <= n; x++) {
        int target = (x - 1) * 2 + 1;
        for (int y = 1; y <= (base - target) / 2; y++) {
          System.out.print(" ");
        }
        for (int y = 1; y <= ((x - 1) * 2 + 1); y++) {
          System.out.print('*');
        }
        for (int y = 1; y <= (base - target) / 2; y++) {
          System.out.print(" ");
        }
        System.out.println();
      }
    }
  }
}
