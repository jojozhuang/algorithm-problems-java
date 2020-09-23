package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3041 {
    public int getMaxLen(int[] nums) {
        int max = 0;
        int first = -1;
        int last = -1;
        int start = -1;
        int count = 0; // number of zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (first != -1) {
                    if (count % 2 == 0) {
                        max = Math.max(max, i - 1 - start + 1);
                    } else {
                        max = Math.max(max, Math.max(i - 1 - (first + 1) + 1, last - 1 - start + 1));
                    }
                } else if (start != -1) {
                    max = Math.max(max, i - 1 - start + 1);
                }
                count = 0;
                start = -1;
                first = -1;
                last = -1;
            } else {
                if (start == -1) {
                    start = i;
                }
                if (nums[i] < 0) {
                    count++;
                    if (first == -1) {
                        first = i;
                        last = i;
                    } else {
                        last = i;
                    }
                }
            }
        }

        if (count > 0) {
            if (count % 2 == 0) {
                max = Math.max(max, nums.length - 1 - start + 1);
            } else {
                max = Math.max(max, Math.max(nums.length - 1 - (first + 1) + 1, last - 1 - start + 1));
            }
        } else if (start != -1) {
            max = Math.max(max, nums.length - 1 - start + 1);
        }


        return max;
    }
}
