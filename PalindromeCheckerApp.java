import java.util.*;

class PalindromeCheckerApp {
    public static void main(String[] args) {
    
    String str = "madam";
    
    Deque<Character> deque = new ArrayDeque<>();
    
    for (int i = 0; i < str.length(); i++) {
        deque.addLast(str.charAt(i));
    }
    
    boolean isPalindrome = true;
    
    while (deque.size() > 1) {
        if (deque.removeFirst() != deque.removeLast()) {
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