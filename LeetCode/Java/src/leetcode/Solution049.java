/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
    public List<String> anagrams(String[] strs) {
        if (strs==null||strs.length==0)
            return new ArrayList<String>();
        
        List<String> ret = new ArrayList<String>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        String sorted;
        char[] chars;
        for (String item: strs) {
            chars = item.toCharArray();
            Arrays.sort(chars);
            sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<String>();
                list.add(item);
                map.put(sorted, list);
            }
            else {
                List<String> list = new ArrayList<String>();
                list = map.get(sorted);
                list.add(item);
                map.replace(sorted, list);
            }
        }
        
        for(List<String> li: map.values()) {
            if (li.size()>1)
                ret.addAll(li);
        }
        
        return ret;
    }
   
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0 )
            return new ArrayList<List<String>>();
                
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        String sorted = "";
        char[] chars;
        for(String item: strs) {
            chars = item.toCharArray();
            Arrays.sort(chars);
            sorted = String.valueOf(chars);
            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<String>();
                list.add(item);
                map.put(sorted, list);
            }
            else {
                List<String> list = map.get(sorted);
                list.add(item);
                //map.replace(sorted, list);
            }
        }
        
        List<List<String>> ret = new ArrayList<List<String>>();
        
        for(List<String> li: map.values()) {
            ret.add(li);
        }
        
        return ret;
    }
        
    private String reverse(String str) {
        if(str==null||str.length()==0)
            return str;
        
        String ret="";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;
        char temp;
        
        while(left<=right) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        ret = String.valueOf(chars);
        return ret;
    }
}
