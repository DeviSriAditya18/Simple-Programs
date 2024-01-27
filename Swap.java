import java.util.*;

public class Swap {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Before Swapping 'a' is:" + a + " 'b' is:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("After Swapping 'a' is:" + a + " 'b' is:" + b);
    }
}
