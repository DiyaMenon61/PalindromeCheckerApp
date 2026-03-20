import java.util.*;

public class PalindromeCheckApp {

    // recursive function
    static boolean isPal(String s, int start, int end) {
        if (start >= end)
            return true; // base condition

        if (s.charAt(start) != s.charAt(end))
            return false;

        return isPal(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        boolean result = isPal(str, 0, str.length() - 1);

        System.out.println(result ? "Palindrome" : "Not Palindrome");
    }
}