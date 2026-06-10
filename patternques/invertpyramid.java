import java.util.Scanner;

public class invertpyramid {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int l = sc.nextInt();

            // outerloop

            for (int i = l; i >= 1; i--) {
                // innerloop

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
