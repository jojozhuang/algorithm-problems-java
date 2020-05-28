package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3002 {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            if (i >= k) {
                char old = s.charAt(i - k);
                if (old == 'a' || old == 'e' || old == 'i' || old == 'o' || old == 'u') {
                    count--;
                }
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}
