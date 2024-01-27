import java.util.*;

public class Anagram {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        int f = 0;
        if (c1.length != c2.length) {
            System.out.print("Not an Anagram");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.print("Not an Anagram");
                System.exit(0);
            }
        }
        System.out.print("Anagram");
    }

}