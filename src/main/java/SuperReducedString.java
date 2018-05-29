import java.util.ArrayDeque;
import java.util.Deque;

// Steve has a string of lowercase characters in range ascii[‘a’..’z’].
// He wants to reduce the string to its shortest length by doing a series of operations 
// in which he selects a pair of adjacent lowercase letters that match, and then he deletes them. 
// For instance, the string aab could be shortened to b in one operation.
// Steve’s task is to delete as many characters as possible using this method and print the resulting string.
// If the final string is empty, print "Empty String".

// Sample 1
// aaabccddd -> abd

// Sample 2
// aa -> Empty String

// Sample 3
// baab -> Empty String

class SuperReducedString {
    public static String solution(String s) {
        if (s == null) return "Empty String";

        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (!stack.isEmpty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            return "Empty String";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}