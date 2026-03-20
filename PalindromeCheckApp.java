import java.util.*;

// service class
class PalindromeChecker {
    boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

// main class
public class PalindromeCheckApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        PalindromeChecker p = new PalindromeChecker();
        boolean result = p.checkPalindrome(str);

        System.out.println(result ? "Palindrome" : "Not Palindrome");
    }
}