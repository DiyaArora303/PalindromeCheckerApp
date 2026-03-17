import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String str);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }
        
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class
class PalindromeChecker {
    private PalindromeStrategy strategy;
    
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean checkPalindrome(String str) {
        return strategy.check(str);
    }
}

// Main Class (ONLY one public class allowed if needed)
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        
        String str = "madam";
        
        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy(); 
        // PalindromeStrategy strategy = new DequeStrategy();
        
        PalindromeChecker checker = new PalindromeChecker(strategy);
        
        if (checker.checkPalindrome(str)) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome.");
        }
    }
}