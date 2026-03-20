import java.util.*;

class Node {
    char d;
    Node next;

    Node(char d) {
        this.d = d;
    }
}

public class PalindromeCheckApp {

    static Node rev(Node h) {
        Node p = null;
        while (h != null) {
            Node n = h.next;
            h.next = p;
            p = h;
            h = n;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Node h = null, t = null;

        // create list
        for (char c : s.toCharArray()) {
            Node n = new Node(c);
            if (h == null)
                h = t = n;
            else {
                t.next = n;
                t = n;
            }
        }

        // middle
        Node slow = h, fast = h;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse + compare
        Node r = rev(slow);
        boolean p = true;

        while (r != null) {
            if (h.d != r.d) {
                p = false;
                break;
            }
            h = h.next;
            r = r.next;
        }

        System.out.println(p ? "Palindrome" : "Not Palindrome");
    }
}