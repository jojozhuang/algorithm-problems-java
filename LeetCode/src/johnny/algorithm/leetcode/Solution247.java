package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Strobogrammatic Number II.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * 
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
        if (remain == 0) { return new ArrayList<String>(Arrays.asList("")); }
        if (remain == 1) { return new ArrayList<String>(Arrays.asList("0", "1", "8")); }
        List<String> curResults = new ArrayList<>();
        List<String> prevResults = helper(remain - 2, level + 1);
        for (String s: prevResults) {
            if (level > 0) { 
                curResults.add("0" + s + "0"); 
            }
            curResults.add("1" + s + "1");
            curResults.add("6" + s + "9");
            curResults.add("8" + s + "8");
            curResults.add("9" + s + "6");
        }
        return curResults;
    }
}
