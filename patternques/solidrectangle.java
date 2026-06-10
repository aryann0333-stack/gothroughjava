import java.util.Scanner;

public class solidrectangle {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of rectangle: ");
            int l = sc.nextInt();
            System.out.print("Enter breadth of rectangle: ");
            int b = sc.nextInt();

            // outerloop

            for (int i = 1; i <= l; i++) {
                // innerloop

                for (int j = 1; j <= b; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
