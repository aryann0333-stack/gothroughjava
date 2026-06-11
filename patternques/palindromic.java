//  to print pallindromic pattern 

import java.util.Scanner;

public class palindromic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of palindromic triangle: ");
            int leng = sc.nextInt();

            // for total number of rows outer loop
            for (int i = 1; i <= leng; i++) {

                // for spaces from left side
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }

                // for numbers printing from left side
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // for number of right side after 1
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                // for next line after one row
                System.out.println();
            }
        }
    }
}