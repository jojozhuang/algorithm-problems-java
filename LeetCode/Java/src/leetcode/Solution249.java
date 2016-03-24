/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Group Shifted Strings.
 * 
 * Given a string, we can "shift" each of its letter to its successive letter,
 * for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:
 * 
 * "abc" -> "bcd" -> ... -> "xyz"
 * Given a list of strings which contains only lowercase alphabets, group all 
 * strings that belong to the same shifting sequence.
 * For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
 * 
 * Return:
 * 
 * [
 *   ["abc","bcd","xyz"],
 *   ["az","ba"],
 *   ["acef"],
 *   ["a","z"]
 * ]
 * 
 * @author RZHUANG
 */
public class Solution249 {
    //http://ryanleetcode.blogspot.com/2015/10/group-shifted-strings-leetcode.html
   public List<List<String>> groupStrings(String[] strings) {
       List<List<String>> res = new ArrayList();
       if (strings == null || strings.length == 0) {
           return res;
       }
       
       HashMap<String, List<String>> map = new HashMap<String, List<String>>();
       for (int i = 0; i < strings.length; i++) {
           String str = strings[i];
           StringBuilder sb = new StringBuilder();
           for (int j = 1; j < str.length(); j++) {
               int gap = (str.charAt(j) - str.charAt(j - 1) + 26) % 26;
               sb.append(gap + " ");
           }
           String key = sb.toString();
           if (!map.containsKey(key)) {
               List<String> list = new ArrayList<String>();
               map.put(key, list);
           }
           map.get(key).add(str);
       }
       
       for(List<String> item: map.values()) {
           Collections.sort(item);
           res.add(item);
       }
       
       return res;
   } 
}
