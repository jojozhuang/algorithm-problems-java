package johnny.leetcode.algorithm;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Johnny
 */
public class SolutionA1211 {
    public int equalSubstring(String s, String t, int maxCost) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i) - t.charAt(i));
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }

        int ans = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (maxCost >= 0 && iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (maxCost < entry.getKey()) {
                break;
            }
            int count = entry.getValue();
            while (maxCost >= 0 && maxCost >= entry.getKey() && count > 0) {
                maxCost -= entry.getKey();
                count--;
                ans++;
            }
        }

        return ans;
    }
}
