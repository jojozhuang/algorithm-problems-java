package johnny.leetcode.algorithm;

import java.util.HashMap;

/**
 * Strobogrammatic Number.
 * <p>
 * A strobogrammatic number is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 * <p>
 * Write a function to determine if a number is strobogrammatic. The number is
 * represented as a string.
 * <p>
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 *
 * @author Johnny
 */
public class Solution246 {
    public boolean isStrobogrammatic(String num) {
        if (num == null || num.length() == 0) {
            return true;
        }
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char c1 = num.charAt(left);
            char c2 = num.charAt(right);
            if (c1 == '2' || c1 == '3' || c1 == '4' || c1 == '5' || c1 == '7') {
                return false;
            }
            if (c2 == '2' || c2 == '3' || c2 == '4' || c2 == '5' || c2 == '7') {
                return false;
            }
            if (c1 == '6' && c2 != '9' || c1 == '9' && c2 != '6') {
                return false;
            }
            if (c1 == '0' && c2 != '0' || c1 == '1' && c2 != '1' || c1 == '8' && c2 != '8') {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean isStrobogrammatic2(String num) {
        if (num == null || num.isEmpty()) {
            return true;
        }

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;
        while (left < right) {
            if (!map.containsKey(num.charAt(left))) {
                return false;
            }
            if (map.get(num.charAt(left)) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        if (num.length() % 2 == 0) {
            return true;
        } else {
            char c = num.charAt(num.length() / 2);
            if (c == '0' || c == '1' || c == '8') {
                return true;
            } else {
                return false;
            }
        }
    }
}
