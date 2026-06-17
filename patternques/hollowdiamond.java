// to print hollow diamond

import java.util.Scanner;

public class hollowdiamond {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of diamond: ");
            int leng = sc.nextInt();

            // outer loop for number of rows
            for (int i = 1; i <= leng; i++) {

                // part1 for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }

                // part2 for 1 star
                if (i == 1) {
                    System.out.print("*");
                } else {

                    // part 2 for 1 *
                    System.out.print("*");

                    // part 2 for 2*i-3 spaces
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    // part 2 for 1 star
                    System.out.print("*");
                }

                // for next line
                System.out.println();
            }

            // reversing the logic to print lower half
            // outer loop for number of rows
            for (int i = leng - 1; i >= 1; i--) {

                // part1 for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }

                // part2 for 1 star
                if (i == 1) {
                    System.out.print("*");
                } else {

                    // part 2 for 1 *
                    System.out.print("*");

                    // part 2 for 2*i-3 spaces
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    // part 2 for 1 star
                    System.out.print("*");
                }

                // for next line
                System.out.println();
            }
        }
    }
}