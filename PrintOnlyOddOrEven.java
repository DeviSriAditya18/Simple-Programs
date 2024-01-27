import java.util.*;

public class PrintOnlyOddOrEven {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("Even Numbers Less Than " + n + " are:");
        even(n);
        System.out.print("Odd Numbers Less Than " + n + " are:");
        odd(n);
    }

    static void even(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    static void odd(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }

}
