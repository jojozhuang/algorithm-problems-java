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
 * Anagrams.
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
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
