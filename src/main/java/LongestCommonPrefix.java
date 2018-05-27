// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// Note: All given inputs are in lowercase letters a-z.

public class LongestCommonPrefix {
    public static String solution(String[] a) {
        if (a == null || a.length == 0) return "";
        for (int i = 0; i < a[0].length(); i++) {
            char c = a[0].charAt(i);
            for (int j = 1; j < a.length; j++) {
                if (i == a[j].length() || c != a[j].charAt(i)) {
                    return a[0].substring(0, i);
                }
            }
        }
        return a[0];
    }
}
