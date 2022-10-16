public class leetcode459 {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.length() % i == 0) {
                if (judge(s.substring(0, i), s))
                    return true;
            }
        }
        return false;
    }

    public boolean judge(String sub, String S) {
        int len = sub.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != sub.charAt(i % len))
                return false;
        }
        return true;
    }
}
