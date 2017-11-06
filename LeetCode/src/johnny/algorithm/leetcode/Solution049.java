/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Group Anagrams.
 * Given an array of strings, group anagrams together.
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
 * 
 * Return:
 * 
 * [
 *   ["ate", "eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 * For the return value, each inner list's elements must follow the lexicographic order.
 * All inputs will be in lower-case.
 *  * 
 * @author Johnny
 */
public class Solution049 {
    //http://www.programcreek.com/2014/04/leetcode-anagrams-java/
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) {
            return res;
        }

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String str: strs) {
            char[] arrStr = str.toCharArray();
            Arrays.sort(arrStr);
            String key = new String(arrStr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        
        for(List<String> li: map.values()) {
            if (li.size() > 1) {
                Collections.sort(li);
            }
            res.add(li);
        }
        
        return res;
    }
}
