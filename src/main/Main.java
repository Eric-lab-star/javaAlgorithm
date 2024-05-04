
package main;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("9x9 Table");
    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        switch (i) {
          case 0:
            if (j == 0) {
              System.out.print("   |");
            }
            if (j != 0) {
              System.out.printf("%3d", j);
            }

            break;
          default:
            if (j == 0) {
              System.out.printf("%3d|", i);
            } else {
              System.out.printf("%3d", i * j);
            }
            break;
        }
      }

      System.out.println();

      if (i == 0) {
        System.out.printf("%s", "---+");
        System.out.printf("%s%n", "---".repeat(10));
      }
    }
  }
}
