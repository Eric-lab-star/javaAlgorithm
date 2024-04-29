
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

    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    System.out.printf("greatest number is %d%n", max);
    stdIn.close();
  }
}
