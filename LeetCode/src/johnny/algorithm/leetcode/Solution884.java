package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 884. Uncommon Words from Two Sentences
 * 
 * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order.

 

Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]
 

Note:

0 <= A.length <= 200
0 <= B.length <= 200
A and B both contain only spaces and lowercase letters.

 * @author Johnny
 */
public class Solution884 {
    public String[] uncommonFromSentences(String A, String B) {
        String[] words1 = A.split(" ");
        String[] words2 = B.split(" ");
        
        List<String> list = new ArrayList<String>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < words1.length; i++) {
            if (map1.containsKey(words1[i])) {
                map1.put(words1[i], map1.get(words1[i]) + 1);
            } else {
                map1.put(words1[i], 1);
            }
        }
        for (int j = 0; j < words2.length; j++) {
            if (map2.containsKey(words2[j])) {
                map2.put(words2[j], map2.get(words2[j]) + 1);
            } else {
                map2.put(words2[j], 1);
            }
        }
        
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1 && !map2.containsKey(s)) {
                list.add(s);
            } else {
                map2.remove(s);
            }
        }
        
        for (String s : map2.keySet()) {
            if (map2.get(s) == 1) {
                list.add(s);
            }
        }
        
        String[] res = new String[list.size()];
        return list.toArray(res);
    }
}
