import java.util.*;

class PalindromeCheckerApp {
    
    // Recursive function
    static boolean isPalindrome(String str, int start, int end) {
        
        // Base condition
        if (start >= end) {
            return true;
        }
        
        // Check characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        
        String str = "madam";  // Hardcoded string
        
        boolean result = isPalindrome(str, 0, str.length() - 1);
        
        if (result) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome.");
        }
    }
}