package johnny.leetcode.algorithm;

/**
 * 1363. Largest Multiple of Three
 *
 * Given an integer array of digits, return the largest multiple of three that can be formed by concatenating some of the given digits in any order.
 *
 * Since the answer may not fit in an integer data type, return the answer as a string.
 *
 * If there is no answer return an empty string.
 *
 * Example 1:
 * Input: digits = [8,1,9]
 * Output: "981"
 *
 * Example 2:
 * Input: digits = [8,6,7,1,0]
 * Output: "8760"
 *
 * Example 3:
 * Input: digits = [1]
 * Output: ""
 *
 * Example 4:
 * Input: digits = [0,0,0,0,0,0]
 * Output: "0"
 *
 * Constraints:
 *
 * 1 <= digits.length <= 10^4
 * 0 <= digits[i] <= 9
 * The returning answer must not contain unnecessary leading zeros.
 *
 * @author Johnny
 */
public class SolutionA1363 {
    public String largestMultipleOfThree(int[] digits) {
        int sum = 0;
        int[] count = new int[10];
        for (int i : digits) {
            count[i]++;
            sum += i;
        }

        if (sum == 0) {
            return "0";
        }

        if (sum % 3 == 0) {
            // go to build string
        } else if (sum % 3 == 1 && (count[1] + count[4] + count[7] > 0)) {
            // remove one digit of 1,4,7
            if (count[1] > 0) {
                count[1]--;
                sum -= 1;
            } else if (count[4] > 0) {
                count[4]--;
                sum -= 4;
            } else if (count[7] > 0) {
                count[7]--;
                sum -= 7;
            }
        } else if (sum % 3 == 2 && (count[2] + count[5] + count[8] > 0)) {
            // remove one digit of 2,5,8
            if (count[2] > 0) {
                count[2]--;
                sum -= 2;
            } else if (count[5] > 0) {
                count[5]--;
                sum -= 5;
            } else if (count[8] > 0) {
                count[8]--;
                sum -= 8;
            }
        } else if (sum % 3 == 2 && (count[1] + count[4] + count[7] > 1)) {
            // remove two digits of 1,4,7
            int[] diff = new int[]{1,4,7};
            int i = 0;
            while (i < 3) {
                if (count[diff[i]] > 0) {
                    count[diff[i]]--;
                    sum -= diff[i];
                } else {
                    i++;
                }
                if (sum % 3 == 0) {
                    break;
                }
            }
        } else if (sum % 3 == 1 && (count[2] + count[5] + count[8] > 1)) {
            // remove two digits of 2,5,8
            int[] diff = new int[]{2,5,8};
            int i = 0;
            while (i < 3) {
                if (count[diff[i]] > 0) {
                    count[diff[i]]--;
                    sum -= diff[i];
                } else {
                    i++;
                }
                if (sum % 3 == 0) {
                    break;
                }
            }
        }

        if (sum % 3 != 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                sb.append(i);
                count[i]--;
            }
        }

        return sb.toString();
    }

    public String largestMultipleOfThree2(int[] digits) {
        int sum = 0;
        int[] count = new int[10];
        for (int i : digits) {
            count[i]++;
            sum += i;
        }

        if (sum == 0) {
            return "0";
        }
        if (sum % 3 == 0) {
            return solve(count, sum, 0);
        }
        if (sum % 3 == 1) {
            return solve(count, sum, 1);
        }
        if (sum % 3 == 2) {
            return solve(count, sum, 2);
        }
        return "";
    }

    private String solve(int[] count, int sum, int diff) {
        if (diff == 0) {
            return build(count);
        }
        int mod = diff;
        while (sum % 3 != 0) {
            if (count[mod] > 0) {
                sum -= mod;
                count[mod]--;
            }
            if (mod % 3 == diff || count[mod] <= 0) {
                mod += 3;
            }
            if (mod > 9) {
                mod = (mod + mod) % 3;
            }
        }
        return build(count);
    }

    private String build(int[] count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                sb.append(i);
                count[i]--;
            }
        }

        return sb.toString();
    }
}
