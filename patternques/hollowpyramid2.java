// to  print solid pyramid

import java.util.Scanner;

public class hollowpyramid2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of hollow pyramid: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) {

                // for spaces(part 1)
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print("  ");
                }

                // part 2
                if (i == 1 || i == leng) {
                    // for first and last row

                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("* ");
                    }
                    // middle rows

                } else {

                    // 1*
                    System.out.print("* ");

                    // 2*i-3 space
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print("  ");
                    }

                    // 1*
                    System.out.print("* ");

                }
                System.out.println();
            }

        }
    }
}
