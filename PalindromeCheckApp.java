import java.util.*;

public class PalindromeCheckApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        // add characters
        for (char c : str.toCharArray()) {
            q.add(c); // enqueue
            s.push(c); // push
        }

        boolean isPal = true;

        // compare
        for (int i = 0; i < str.length(); i++) {
            if (q.remove() != s.pop()) {
                isPal = false;
                break;
            }
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}