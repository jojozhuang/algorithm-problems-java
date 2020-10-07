package johnny.leetcode.algorithm;

/**
 * 1419. Minimum Number of Frogs Croaking
 *
 * Given the string croakOfFrogs, which represents a combination of the string "croak" from different frogs, that is, multiple frogs can croak at the same time, so multiple “croak” are mixed. Return the minimum number of different frogs to finish all the croak in the given string.
 *
 * A valid "croak" means a frog is printing 5 letters ‘c’, ’r’, ’o’, ’a’, ’k’ sequentially. The frogs have to print all five letters to finish a croak. If the given string is not a combination of valid "croak" return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: croakOfFrogs = "croakcroak"
 * Output: 1
 * Explanation: One frog yelling "croak" twice.
 * Example 2:
 *
 * Input: croakOfFrogs = "crcoakroak"
 * Output: 2
 * Explanation: The minimum number of frogs is two.
 * The first frog could yell "crcoakroak".
 * The second frog could yell later "crcoakroak".
 * Example 3:
 *
 * Input: croakOfFrogs = "croakcrook"
 * Output: -1
 * Explanation: The given string is an invalid combination of "croak" from different frogs.
 * Example 4:
 *
 * Input: croakOfFrogs = "croakcroa"
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= croakOfFrogs.length <= 10^5
 * All characters in the string are: 'c', 'r', 'o', 'a' or 'k'.
 */
public class SolutionA1419 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs == null || croakOfFrogs.isEmpty() || croakOfFrogs.length() % 5 != 0) {
            return -1;
        }

        int qc = 0;
        int qr = 0;
        int qo = 0;
        int qa = 0;

        int count = 1;
        int min = 1;
        for (char c : croakOfFrogs.toCharArray()) {
            if (c == 'c') {
                qc++;
                count++;
            } else if (c == 'r') {
                if (qc ==0 ) {
                    return -1;
                } else {
                    qr++;
                    qc--;
                }
            } else if (c == 'o') {
                if (qr == 0) {
                    return -1;
                } else {
                    qo++;
                    qr--;
                }
            } else if (c == 'a') {
                if (qo == 0) {
                    return -1;
                } else {
                    qa++;
                    qo--;
                }
            } else if (c == 'k') {
                if (qa == 0) {
                    return -1;
                } else {
                    qa--;
                    count--;
                    min = Math.max(min, count);
                }
            }
        }

        return min;
    }
}
