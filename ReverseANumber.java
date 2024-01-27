import java.util.*;

public class ReverseANumber {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Number:" + n);
        int x = 0;
        while (n != 0) {
            int r = n % 10;
            x = x * 10 + r;
            n /= 10;
        }
        System.out.print("After reverse:" + x);
    }
}
