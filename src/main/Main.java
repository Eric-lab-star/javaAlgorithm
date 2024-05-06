
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

      for (int x = 1; x <= n; x++) {
        for (int y = 1; y <= x; y++) {
          System.out.print('*');
        }
        System.out.println();
      }
    }
  }
}
