package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1189. Maximum Number of Balloons
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * <p>
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * <p>
 * Example 1:
 * Input: text = "nlaebolko"
 * Output: 1
 * <p>
 * Example 2:
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * <p>
 * Example 3:
 * Input: text = "leetcode"
 * Output: 0
 * <p>
 * Constraints:
 * <pre>{@code
 * 1 <= text.length <= 10^4
 * text consists of lower case English letters only.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1189 {
    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1]; //for b
        min = Math.min(min, chars[0]);//for a
        min = Math.min(min, chars[11] / 2);// for l /2
        min = Math.min(min, chars[14] / 2);//similarly for o/2
        min = Math.min(min, chars[13]);//for n
        return min;
    }

    // map + set
    public int maxNumberOfBalloons3(String text) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('l');
        set.add('n');
        set.add('o');
        for (char c : text.toCharArray()) {
            if (set.contains(c)) {
                if (!map.containsKey(c)) {
                    map.put(c, 0);
                }
                map.put(c, map.get(c) + 1);
            }
        }

        int max = text.length() / 7;
        for (Character c : set) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return 0;
            }
            int count = map.get(c);
            if (c == 'l' || c == 'o') { // l or o
                count = count / 2;
            }
            if (count < max) {
                max = count;
            }
        }

        return max;
    }

    // map + array
    public int maxNumberOfBalloons2(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        int max = text.length() / 7;
        Character[] balloon = new Character[]{'a', 'b', 'l', 'n', 'o'};
        for (int i = 0; i < balloon.length; i++) {
            if (!map.containsKey(balloon[i]) || map.get(balloon[i]) <= 0) {
                return 0;
            }
            int count = map.get(balloon[i]);
            if (balloon[i] == 'l' || balloon[i] == 'o') { // l or o
                count = count / 2;
            }
            if (count < max) {
                max = count;
            }
        }

        return max;
    }
}
