import java.util.*;

public class VowelCheck {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        str = str.toLowerCase();
        List<Character> l = new ArrayList<>();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
        int f = 0;
        for (int i = 0; i < str.length(); i++) {
            if (l.contains(str.charAt(i))) {
                f = 1;
                System.out.print("Vowel Found");
                break;
            }
        }
        if (f == 0)
            System.out.print("Vowel Not Found");
    }
}
