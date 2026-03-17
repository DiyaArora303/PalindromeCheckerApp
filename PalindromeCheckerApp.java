import java.util.*;

class PalindromeCheckerApp {
    public static void main(String[] args) {
        
        String str = "madam";   // Hardcoded string
        
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
        // Insert into Queue and Stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }
        
        boolean isPalindrome = true;
        
        // Compare dequeue (queue) and pop (stack)
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        
        // Display result
        if (isPalindrome) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.println("The string " + str + " is not a palindrome.");
        }
    }
}