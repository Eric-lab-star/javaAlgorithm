
package main;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("find greates number from 3 inputs");
    System.out.print("a: ");
    int a = stdIn.nextInt();
    System.out.print("b: ");
    int b = stdIn.nextInt();
    System.out.print("c: ");
    int c = stdIn.nextInt();

    System.out.print("d: ");
    int d = stdIn.nextInt();

    int min = a;

    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }

    if (d < min) {
      min = d;
    }
    System.out.printf("smallest number is %d%n", min);
    stdIn.close();
  }
}
