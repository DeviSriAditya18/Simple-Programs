import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = 0;
        if (n == 0 || n == 1) {
            System.out.print("Not a Prime");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    f = 1;
                    System.out.print("Not a Prime");
                    break;
                }
            }
            if (f == 0)
                System.out.print("Prime");
        }
    }
}
