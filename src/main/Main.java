
package main;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    for (int i = 0; i < n / 2; i++) {
      System.out.println("+-");
    }
    if (n % 2 != 0) {
      System.out.println("+");
    }
    stdIn.close();
  }
}
