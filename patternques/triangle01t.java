
//   to print o101  triangle

import java.util.Scanner;

public class triangle01t {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of 0 1 0 triangle: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) { // outer loop for number of rows

                for (int j = 1; j <= i; j++) { // inner loop for printing number traingle
                    if ((i + j) % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}
