import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        int f = 1;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                f = 0;
                break;
            }
        }
        if (f == 1)
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
    }
}
