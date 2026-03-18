import java.util.Scanner;

public class PalindromeCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare using equals()
        if (original.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}