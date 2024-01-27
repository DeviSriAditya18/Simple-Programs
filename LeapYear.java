import java.util.*;

public class LeapYear {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 100 == 0) {
            if (n % 400 == 0) {
                System.out.print(n + " is a Leap year");
            } else
                System.out.print(n + " is not a Leap year");
        } else {
            if (n % 4 == 0) {
                System.out.print(n + " is a Leap year");
            } else
                System.out.print(n + " is not a Leap year");
        }
    }
}
