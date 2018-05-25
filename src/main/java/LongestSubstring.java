import java.util.HashSet;

// Given a string, find the length of the longest substring without repeating characters.

// Examples:
// Given "abcabcbb", the answer is "abc", which the length is 3.
// Given "bbbbb", the answer is "b", with the length of 1.
// Given "pwwkew", the answer is "wke", with the length of 3. 
// Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubstring {
    public static int solution(String s) {
        if (s == null) return 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, n = s.length(), ans = 0;
        while (i < n && j < n) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                ans = Math.max(set.size(), ans);
            }
        }
        return ans;
    }
}