package johnny.lintcode.algorithm;

/**
 * Rotated Digits.
 * X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X. Each digit must be rotated - we cannot choose to leave it alone.
 *
 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.
 *
 * Now given a positive number N, how many numbers X from 1 to N are good?
 *
 * Example
 * Example 1:
 *
 * Input: 10
 * Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 * Example 2:
 *
 * Input: 5
 * Output: 2
 * Explanation:
 * There are two good numbers in the range [1, 5] : 2, 5.
 *
 * @author Johnny
 */
public class RotatedDigits {
    /**
     * @param N: a positive number
     * @return: how many numbers X from 1 to N are good
     */
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int num = i;
            int rotated = 0;
            boolean valid = true;
            int j = 1;
            while (num > 0) {
                int last = num % 10;
                if (last == 3 || last == 4 || last == 7) {
                    valid = false;
                    break;
                }
                if (last == 2) {
                    last = 5;
                } else if (last == 5) {
                    last = 2;
                } else if (last == 6) {
                    last = 9;
                } else if (last == 9) {
                    last = 6;
                }
                rotated = last * j + rotated;
                j = j * 10;
                num = num / 10;
            }
            if (rotated == i) {
                valid = false;
            }
            if (valid) {
                count++;
            }
        }

        return count;
    }
}
