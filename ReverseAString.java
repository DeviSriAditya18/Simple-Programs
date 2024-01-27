import java.util.*;

public class ReverseAString {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        System.out.println("String:" + str);
        StringBuilder st = new StringBuilder();
        int i = 0;
        int j = n - 1;
        while (i < n) {
            st.append(str.charAt(j));
            i++;
            j--;
        }
        System.out.print("After Reverse:" + st.toString());
    }
}
