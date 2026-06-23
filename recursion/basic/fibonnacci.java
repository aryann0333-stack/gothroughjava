
// to print fibonnacci series using recursion
import java.util.Scanner;

public class fibonnacci {
    public static int fibonnaccii(int term) {

        // base condition
        if (term == 0) {
            return 0;
        }
        if (term == 1) {
            return 1;
        }
        // recursive relation
        return fibonnaccii(term - 1) + fibonnaccii(term - 2);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of terms in fibonnacci series: ");
            int term = sc.nextInt();

            System.out.print("Fibonnacci series: ");
            for (int i = 0; i <= term; i++) {
                System.out.print(fibonnaccii(i) + " ");

            }
        }
    }
}
