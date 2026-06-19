
/*  to print number triangle
      1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1  */

import java.util.Scanner;

public class numberpy2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of number pyramid: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) {

                // for spaces loop
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print("  ");
                }

                // part 2 for numbers printing loop
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }

                // part 2 for otherside

                int decrow = i - 1;

                for (int j = 2; j <= i; j++) {
                    System.out.print(decrow + " ");

                    decrow--;
                }
                System.out.println();
            }
        }
    }
}
