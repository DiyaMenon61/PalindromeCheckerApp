package PalindromeCheckerApp;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out,print("Input text:");
        String input=sc.nextalaine();
        boolean isPalindrome = true;
        int n=input.length()-1;
        for(int i= 0;i<n;i++){
            if input.charAt(i)!=input.charAt(n-1))
            {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("It is a palindrome ? : "+isPalindrome);
        }else{
            System.out.println("It is not a palindrome ? :");
        }

    }
}
