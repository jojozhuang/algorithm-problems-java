package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Palindrome Permutation II.
 * Given a string s, return all the palindromic permutations
 * (without duplicates) of it. Return an empty list if no palindromic
 * permutation could be form.
 * <p>
 * For example:
 * <p>
 * Given s = "aabb", return ["abba", "baab"].
 * <p>
 * Given s = "abc", return [].
 * <p>
 * <p>
 * Hint:
 * <p>
 * If a palindromic permutation exists, we just need to generate the first
 * half of the string.
 * To generate all distinct permutations of a (half of) string, use a similar
 * approach from: Permutations II or Next Permutation.
 *
 * @author Johnny
 */
public class Solution267 {
    //https://discuss.leetcode.com/topic/22214/ac-java-solution-with-explanation
    public List<String> generatePalindromes(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return res;
        }

        int odd = 0;
        String mid = "";
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        // step 1. build character count map and count odds
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
            odd += map.get(c) % 2 != 0 ? 1 : -1;
        }

        // cannot form any palindromic string
        if (odd > 1) {
            return res;
        }

        // step 2. add half count of each character to list
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();

            if (val % 2 != 0) {
                mid += key;
            }

            for (int i = 0; i < val / 2; i++) {
                list.add(key);
            }
        }

        // step 3. generate all the permutations
        getPerm(list, mid, new boolean[list.size()], new StringBuilder(), res);

        return res;
    }

    // generate all unique permutation from list
    private void getPerm(List<Character> list, String mid, boolean[] used,
                         StringBuilder sb, List<String> res) {
        if (sb.length() == list.size()) {
            // form the palindromic string
            res.add(sb.toString() + mid + sb.reverse().toString());
            sb.reverse();
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            // avoid duplication
            if (used[i] || i > 0 && list.get(i) == list.get(i - 1) && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            sb.append(list.get(i));
            getPerm(list, mid, used, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }
}
