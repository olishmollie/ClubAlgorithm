// Determine if a given string is a palindrome (spelled the same forwards and backwards).
class IsPalindrome {
    public static Boolean solution(String s) {
        if (s == null || s.length() == 0) return false;
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}