import java.util.*;

public class FactorialUsingLoop {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.print("Factorial is:" + fact);
    }
}
