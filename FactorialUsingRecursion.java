import java.util.*;

public class FactorialUsingRecursion {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("Factorial is:" + fact(n));
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}