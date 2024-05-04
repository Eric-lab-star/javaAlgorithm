
package main;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    int n, w;

    try (Scanner stdIn = new Scanner(System.in)) {
      do {
        System.out.print("n: ");
        n = stdIn.nextInt();
        if (n <= 0) {
          System.out.println("n should be greater than 0");
        }
      } while (n <= 0);

      do {
        System.out.print("w: ");
        w = stdIn.nextInt();
      } while (w <= 0 || w > n);

      for (int i = 0; i < n; i++) {
        System.out.print("*");
        if (i % w == w - 1) {
          System.out.println();
        }
      }
      if (n % w != 0) {
        System.out.println();
      }
    }
  }
}
