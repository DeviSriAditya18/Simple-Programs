import java.util.*;

public class TryCatch {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        try {
            System.out.println("Enter Search Value Index:");
            int m = s.nextInt();
            System.out.print("Value at " + m + " Index is:" + a[m]);
        } catch (Exception e) {
            System.out.print("Something went Wrong");
        }
    }
}
