import java.util.*;

public class PalindromeCheckApp {

    // simple method
    static boolean check1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

    // reverse method
    static boolean check2(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // method 1 time
        long t1 = System.nanoTime();
        boolean r1 = check1(str);
        long t2 = System.nanoTime();

        // method 2 time
        long t3 = System.nanoTime();
        boolean r2 = check2(str);
        long t4 = System.nanoTime();

        System.out.println("Method1: " + (r1 ? "Palindrome" : "Not"));
        System.out.println("Time: " + (t2 - t1));

        System.out.println("Method2: " + (r2 ? "Palindrome" : "Not"));
        System.out.println("Time: " + (t4 - t3));
    }
}