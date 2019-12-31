package johnny.leetcode.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=490497
 *字母骰子，六面字母有可能重复，给15个，input是长15的string，给出一个可行解使筛子的排列有可能组成这个15长度的单词。

follow up是如果有可互换的字母怎么判断，比如W可看成M，Z可能看成N等等
 *
 *
 * @author Johnny
 */
public class AAADiceWord {
    public boolean combine(String[] dices, String word) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < dices.length; i++) {
            for (Character c : dices[i].toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, new ArrayList<>());
                }
                map.get(c).add(i);
            }
        }

        boolean[] ans = new boolean[1];
        dfs(word, 0, map, new boolean[dices.length], ans);
        return ans[0];
    }

    private void dfs(String word, int pos, Map<Character, List<Integer>> map, boolean[] visited, boolean[] ans) {
        if (pos >= word.length()) {
            ans[0] = true;
            return;
        }

        char c = word.charAt(pos);
        if (!map.containsKey(c)) {
            return;
        }
        List<Integer> list = map.get(c);
        for (int i = 0; i < list.size(); i++) {
            if (!visited[list.get(i)]) {
                visited[list.get(i)] = true;
                dfs(word, pos + 1, map, visited, ans);
                visited[list.get(i)] = false;
            }
        }
    }
}
