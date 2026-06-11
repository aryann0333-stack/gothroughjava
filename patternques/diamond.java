// to print diamond pattern

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of diamond: ");
            int leng = sc.nextInt();

            // outer loop for number of rows
            for (int i = 1; i <= leng; i++) {

                // inner loop for space
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }

                // inner loop for stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // inverted outer loop for number of rows
            for (int i = leng; i >= 1; i--) {

                // inverted inner loop for space
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }

                // inverted inner loop for stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
