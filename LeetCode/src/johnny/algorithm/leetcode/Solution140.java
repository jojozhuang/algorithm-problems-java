package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Word Break II.
 * Given a string s and a dictionary of words dict, add spaces in s to construct
 * a sentence where each word is a valid dictionary word.
 * 
 * Return all such possible sentences.
 * 
 * For example, given
 * s = "catsanddog",
 * dict = ["cat", "cats", "and", "sand", "dog"].
 * 
 * A solution is ["cats and dog", "cat sand dog"].
 * 
 * @author Johnny
 */
public class Solution140 {
    // memorization
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        if (s == null || s.length() == 0 ||
            wordDict == null || wordDict.size() == 0) {
            return ans;
        }
        Set<String> set = new HashSet<>(wordDict);
        return helper(s, set, new HashMap<String, List<String>>());
    }
    private List<String> helper(String s, Set<String> set, Map<String, List<String>> map) {
        
        if (map.containsKey(s)) {
            //System.out.println("s="+s);
            //System.out.println("map.get()="+map.get(s));
            return map.get(s);
        }
        
        List<String> list = new ArrayList<>();
        if (set.contains(s)) {
            list.add(s);
        }
        
        for (String word : set) {
            if (s.startsWith(word)) {
                List<String> rest = helper(s.substring(word.length()), set, map);
                for (String sub : rest) {
                    if (sub.isEmpty()) {
                        list.add(word);
                    } else {
                        list.add(word + " " + sub);
                    }
                    
                }
            }
        }
        map.put(s, list);
        return list;
    }
    // no memorization, TLE
    public List<String> wordBreak2(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        if (s == null || s.length() == 0 ||
            wordDict == null || wordDict.size() == 0) {
            return ans;
        }
        
        Set<String> set = new HashSet<>(wordDict);
        for (String word : wordDict) {
            if (word.length() <= s.length() &&
                s.startsWith(word)) {
                List<String> list = new ArrayList<>();
                dfs(s, 0, word.length(), set, list, ans);
            }
        }
        
        return ans;
    }
    
    private void dfs(String s, int i, int j, Set<String> set, List<String> list, List<String> ans) {
        //System.out.println("i="+i+",j="+j + ",s.length" + s.length() + ",list:"+list);
        list.add(s.substring(i,j));
        if (j == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String str: list) {
                sb.append(str);
                sb.append(" ");
            }
            sb.setLength(sb.length() - 1);
            ans.add(sb.toString());
            return;
        }
        
        for (int k = j + 1; k <= s.length(); k++) {
            if (set.contains(s.substring(j, k))) {
                dfs(s, j, k, set, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}
