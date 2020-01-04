package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Strobogrammatic Number II.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * <p>
 * Find all strobogrammatic numbers that are of length = n.
 * For example,
 * Given n = 2, return ["11","69","88","96"].
 *
 * @author Johnny
 */
public class Solution247 {
    public List<String> findStrobogrammatic(int n) {
        return helper(n, 0);
    }

    private List<String> helper(int remain, int level) {
        if (remain == 0) {
            return new ArrayList<String>(Arrays.asList(""));
        }
        if (remain == 1) {
            return new ArrayList<String>(Arrays.asList("0", "1", "8"));
        }
        List<String> res = new ArrayList<>();
        List<String> prev = helper(remain - 2, level + 1);
        for (String s : prev) {
            if (level > 0) {
                res.add("0" + s + "0");
            }
            res.add("1" + s + "1");
            res.add("6" + s + "9");
            res.add("8" + s + "8");
            res.add("9" + s + "6");
        }
        return res;
    }
}
