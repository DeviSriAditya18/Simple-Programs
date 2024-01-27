import java.util.*;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = n;
        int x = 0;
        while (n != 0) {
            int r = n % 10;
            x = x * 10 + r;
            n /= 10;
        }
        if (x == t)
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
    }
}
