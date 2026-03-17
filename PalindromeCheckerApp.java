import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
    
    String str = "madam";
    Stack<Character> stack = new Stack<>();
    
    for (int i = 0; i < str.length(); i++) {
        stack.push(str.charAt(i));
    }
    
    boolean isPalindrome = true;
    
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }
    
    if (isPalindrome) {
        System.out.println("The string " + str + " is a palindrome.");
    } else {
        System.out.println("The string " + str + " is not a palindrome.");
    }
}
}