package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 970. Powerful Integers
 * Given two non-negative integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.
 * <p>
 * Return a list of all powerful integers that have value less than or equal to bound.
 * <p>
 * You may return the answer in any order.  In your answer, each value should occur at most once.
 * <p>
 * Example 1:
 * Input: x = 2, y = 3, bound = 10
 * Output: [2,3,4,5,7,9,10]
 * Explanation:
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 * <p>
 * Example 2:
 * Input: x = 3, y = 5, bound = 15
 * Output: [2,4,6,8,10,14]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= x <= 100
 * 1 <= y <= 100
 * 0 <= bound <= 10^6
 * }</pre>
 *
 * @author Johnny
 */
public class Solution970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 1; i < bound; i *= x) {
            for (int j = 1; i + j <= bound; j *= y) {
                ans.add(i + j);
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return new ArrayList<>(ans);
    }

    public List<Integer> powerfulIntegers2(int x, int y, int bound) {
        List<Integer> xlist = powList(x, bound);
        List<Integer> ylist = powList(y, bound);

        SortedSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < xlist.size(); i++) {
            for (int j = 0; j < ylist.size(); j++) {
                int sum = xlist.get(i) + ylist.get(j);
                if (sum > bound) {
                    break;
                }
                if (!set.contains(sum)) {
                    set.add(sum);
                }
            }
        }

        List<Integer> res = new ArrayList<Integer>(set);
        return res;
    }

    private List<Integer> powList(int val, int bound) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        double pow = Math.pow(val, i);
        while (pow <= bound) {
            list.add((int) pow);
            if (val == 1) {
                break;
            }
            i++;
            pow = Math.pow(val, i);
        }
        return list;
    }

    // without helper method
    public List<Integer> powerfulIntegers3(int x, int y, int bound) {
        Set<Integer> set = new HashSet<Integer>();
        //SortedSet<Integer> set = new TreeSet<Integer>();
        int i = 0;
        while (i >= 0) {
            double pow1 = Math.pow(x, i);
            if (pow1 > bound) {
                break;
            }
            int j = 0;
            while (j >= 0) {
                double sum = pow1 + Math.pow(y, j);
                if (sum > bound) {
                    break;
                } else {
                    set.add((int) sum);
                    j++;
                }
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
            i++;
        }

        List<Integer> res = new ArrayList<Integer>(set);
        return res;
    }
}
