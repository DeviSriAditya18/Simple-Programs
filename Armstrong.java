import java.util.Scanner;
import java.lang.Math;

public class App {
    static boolean isArmstrong(int n) {
        int temp, l = 0, r = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            l++;
        }
        temp = n;
        while (temp > 0) {
            r = temp % 10;
            sum += (Math.pow(r, l));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = s.nextInt();
        if (isArmstrong(n)) {
            System.out.print("Armstrong ");
        } else {
            System.out.print("Not a Armstrong ");
        }
    }
}
