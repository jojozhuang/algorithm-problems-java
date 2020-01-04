package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 767. Reorganize String
 * A Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.
 * <p>
 * If possible, output any possible result.  If not possible, return the empty string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "aab"
 * Output: "aba"
 * Example 2:
 * <p>
 * Input: S = "aaab"
 * Output: ""
 * Note:
 * <p>
 * S will consist of lowercase letters and have length in range [1, 500].
 *
 * @author Johnny
 */
public class Solution767 {
    public String reorganizeString(String S) {
        // Create map of each char to its count
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            int count = map.getOrDefault(c, 0) + 1;
            // Impossible to form a solution
            if (count > (S.length() + 1) / 2) return "";
            map.put(c, count);
        }
        // Greedy: fetch char of max count as next char in the result.
        // Use PriorityQueue to store pairs of (char, count) and sort by count DESC.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (char c : map.keySet()) {
            pq.add(new int[]{c, map.get(c)});
        }
        // Build the result.
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int[] first = pq.poll();
            if (sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1)) {
                sb.append((char) first[0]);
                if (--first[1] > 0) {
                    pq.add(first);
                }
            } else {
                int[] second = pq.poll();
                sb.append((char) second[0]);
                if (--second[1] > 0) {
                    pq.add(second);
                }
                pq.add(first);
            }
        }
        return sb.toString();
    }
}
