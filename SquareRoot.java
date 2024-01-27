import java.util.*;

public class SquareRoot {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        for (int i = 1; i < n / 2; i++) {
            if (i * i == n)
                ans = i;
        }
        if (ans == 0)
            System.out.print("Square Root Not Found");
        else
            System.out.print("Square Root of " + n + " is:" + ans);
    }
}
