import java.util.*;

public class NthLargestNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter 'n' Value:");
        int n = s.nextInt();
        Arrays.sort(a);
        if (n <= size) {
            if (n == 1)
                System.out.print(n + "st Largest Number in the Array is:" + a[size - n]);
            else if (n == 2)
                System.out.print(n + "nd Largest Number in the Array is:" + a[size - n]);
            else if (n == 3)
                System.out.print(n + "rd Largest Number in the Array is:" + a[size - n]);
            else
                System.out.print(n + "th Largest Number in the Array is:" + a[size - n]);
        } else
            System.out.print("No Such Element Found");

    }

}