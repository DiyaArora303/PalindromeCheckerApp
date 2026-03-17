import java.util.*;

class PalindromeCheckerApp {
    
        // Encapsulated method
    public boolean checkPalindrome(String str) {
        
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}

// Main class
class MainApp {
    public static void main(String[] args) {
        
        
        String str = "madam";
        
        PalindromeCheckerApp checker = new PalindromeCheckerApp();
        
        if (checker.checkPalindrome(str)) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome.");
        }
    }
}
