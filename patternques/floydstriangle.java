
//   to print floyds  triangle

import java.util.Scanner;

public class floydstriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of Flyod's triangle: ");
            int leng = sc.nextInt();

            int count = 0;
            for (int i = 1; i <= leng; i++) { // outer loop for number of rows

                for (int j = 1; j <= i; j++) { // inner loop for printing number traingle

                    count++;
                    System.out.print(count + " ");
                }
                System.out.println();
            }
        }
    }
}
