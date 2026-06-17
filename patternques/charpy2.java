
/*
 * to print half character pyramid starting from E to A in last row
 * E
 * E D
 * E D C
 * E D C B
 * E D C B A
 */
import java.util.Scanner;

public class charpy2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of character pyramid: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) {

                // for half pyramid shape
                for (int j = 1; j <= i; j++) {
                    int a = leng - j;
                    int b = 'A';
                    int ans = a + b;
                    char finalans = (char) ans;
                    System.out.print(finalans + " ");
                }
                System.out.println();
            }

        }
    }
}