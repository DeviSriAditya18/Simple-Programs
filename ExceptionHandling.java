import java.util.*;

public class ExceptionHandling {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        System.out.print("Enter Another Number:");
        int m = s.nextInt();
        try {
            System.out.print(n / m);
        } catch (Exception e) {
            System.out.print("Divided By Zero Exception");
        }
    }
}
