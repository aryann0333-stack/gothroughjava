import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int l = sc.nextInt();

            // outerloop

            for (int i = 1; i <= l; i++) {
                // innerloop

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}