import java.util.Scanner;
public class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        System.out.print("Input : ");
        String input = scanner.nextLine();
        boolean isPalindrome = checker.checkPalindrome(input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}