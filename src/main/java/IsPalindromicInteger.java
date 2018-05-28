// Given an integer, determine whether or not it is palindromic
// without converting it to a string.

// Examples:
// isPalindromicInteger(121) == true
// isPalindromicInteger(-121) == false

public class IsPalindromicInteger {
    public static boolean solution(int x) {
        if (x < 0) return false;
        int reverse = 0, xx = x;
        while (xx > 0) {
            int tmp = reverse*10 + xx % 10;
            if (tmp/10 != reverse) return false;
            xx /= 10;
            reverse = tmp;
        }
        return reverse == x;
    }
}