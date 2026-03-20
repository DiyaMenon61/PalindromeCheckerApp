import java.util.*;

public class PalindromeCheckApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        Deque<Character> d = new LinkedList<>();

        // add characters to deque
        for (char c : str.toCharArray()) {
            d.add(c);
        }

        boolean isPal = true;

        // compare front and rear
        while (d.size() > 1) {
            if (d.removeFirst() != d.removeLast()) {
                isPal = false;
                break;
            }
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}