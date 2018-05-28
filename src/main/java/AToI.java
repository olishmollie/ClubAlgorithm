public class AToI {
    public static int solution(String s) {
        long ans = 0;
        if (s != null) {
            int n = s.length();
            boolean inDigit = false, neg = false;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (!inDigit) {
                    if (Character.isWhitespace(c)) {
                        continue;
                    } else if (Character.isDigit(c)) {
                        inDigit = true;
                        ans = ans * 10 + (c - '0');
                        continue;
                    } else {
                        switch (c) {
                            case '+':
                            case '-':
                                inDigit = true;
                                neg = c == '-';
                                break;
                            default:
                                return 0;
                        }
                    }
                } else {
                    if (!Character.isDigit(c)) {
                        break;
                    }
                    ans = ans * 10 + (c - '0');
                    System.out.println(ans);
                }
            }
            if (ans > Integer.MAX_VALUE) {
                ans = neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            if (neg) {
                ans = -1 * ans;
            }
        }
        return (int)ans;
    }
}