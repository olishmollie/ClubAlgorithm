// Given an int, convert it to a string.

public class IToS {
    public static String solution(int x) {
        StringBuilder sb = new StringBuilder();
        boolean neg = x < 0;
        x = Math.abs(x);
        while (x > 0) {
            sb.insert(0, x%10);
            x /= 10;
        }
        if (neg) {
            sb.insert(0, '-');
        }
        return sb.toString();
    }
}