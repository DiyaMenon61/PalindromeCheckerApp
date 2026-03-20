import java.util.*;

public class PalindromeCheckApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // normalize (remove spaces + lowercase)
        str = str.replaceAll("\\s", "").toLowerCase();

        int start = 0, end = str.length() - 1;
        boolean isPal = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}