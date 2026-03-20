import java.util.*;

// interface
interface PalindromeStrategy {
    boolean check(String s);
}

// stack method
class StackStrategy implements PalindromeStrategy {
    public boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray())
            st.push(c);

        for (char c : s.toCharArray())
            if (c != st.pop())
                return false;

        return true;
    }
}

// main
public class PalindromeCheckApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        PalindromeStrategy p = new StackStrategy(); // choose method

        System.out.println(p.check(str) ? "Palindrome" : "Not Palindrome");
    }
}