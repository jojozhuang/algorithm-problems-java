package johnny.leetcode.algorithm;

/**
 * 744. Find Smallest Letter Greater Than Target
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
 * <p>
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 * <p>
 * Examples:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "g"
 * Output: "j"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "j"
 * Output: "c"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 * Note:
 * letters has a length in range [2, 10000].
 * letters consists of lowercase letters, and contains at least 2 unique letters.
 * target is a lowercase letter.
 *
 * @author Johnny
 */
public class Solution744 {
    // binary search, time: O(log(n)), O(1)
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters == null || letters.length == 0) {
            return target;
        }

        int start = 0;
        int end = letters.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            char c = letters[mid];
            if (c > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (end <= letters.length - 1 && letters[end] > target) {
            return letters[end];
        } else {
            return letters[0];
        }
    }

    // time: O(n), space: O(1)
    public char nextGreatestLetter2(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }

        return letters[0];
    }
}
