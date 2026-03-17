import java.util.*;

class PalindromeCheckerApp {
    
    // Recursive function
    public static void main(String[] args) {
    
    String str = "Madam In Eden";
    
    str = str.replaceAll("\\s+", "").toLowerCase();
    
    int start = 0;
    int end = str.length() - 1;
    boolean isPalindrome = true;
    
    while (start < end) {
        if (str.charAt(start) != str.charAt(end)) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }
    
    if (isPalindrome) {
        System.out.println("The given string is a palindrome (ignoring spaces and case).");
    } else {
        System.out.println("The given string is not a palindrome.");
    }
}
}