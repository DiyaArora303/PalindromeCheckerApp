import java.util.*;

class PalindromePerformance {

    // 1. String Reverse Method
    public static boolean reverseMethod(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // 2. Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // 3. Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        String str = "madam";  // Test string
        
        long start, end;

        // Reverse Method
        start = System.nanoTime();
        reverseMethod(str);
        end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start) + " ns");

        // Two Pointer Method
        start = System.nanoTime();
        twoPointerMethod(str);
        end = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (end - start) + " ns");

        // Stack Method
        start = System.nanoTime();
        stackMethod(str);
        end = System.nanoTime();
        System.out.println("Stack Method Time: " + (end - start) + " ns");
    }
}