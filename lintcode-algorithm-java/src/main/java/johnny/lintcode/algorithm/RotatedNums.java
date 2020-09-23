package johnny.lintcode.algorithm;

import java.util.*;

/**
 * Rotated Nums
 * X is a good number when all the number rotates 180° and still be itself.Like "1" ,"2" ,"0”,"12021","69" and "96". It must be noted that we use numbers like the nums on the traffic lights.
 *
 * Give you a len n,we need to count how many good numbers of length n.
 *
 * Rotate the whole good number, not every bit.
 * Except 0, good numbers cannot contain leading zeros.
 * 1<=n<=40
 * Have you met this question in a real interview?
 * Example
 * Input: n = 1
 * Output: 5
 * Explanation: 5 good nums is "0","1","2","5","8"
 * Input: n = 2
 * Output: 6
 * Explanation: 6 good nums is "11","22","55","88","69","96"
 *
 */
public class RotatedNums {
    /**
     * @param n: length of good nums
     * @return: The num of good nums of length n
     */
    public long RotatedNums(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,2);
        map.put(5,5);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);

        int start = (int)Math.pow(10, n - 1);
        if (n == 1) {
            start = 0;
        }
        int end = (int)Math.pow(10, n) - 1;

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (helper(i, map)) {
                count++;
            }
        }

        return count;
    }

    private boolean helper(int num, Map<Integer, Integer> map) {
        int origin = num;
        int next = 0;
        while (num > 0) {
            int last = num % 10;
            if (!map.containsKey(last)) {
                return false;
            } else{
                last = map.get(last);
            }
            next = last + next * 10;
            num = num / 10;
        }

        return next == origin;
    }
}
