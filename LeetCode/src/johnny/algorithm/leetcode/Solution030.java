package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Substring with Concatenation of All Words.
 * You are given a string, S, and a list of words, L, that are all of the same 
 * length. Find all starting indices of substring(s) in S that is a 
 * concatenation of each word in L exactly once and without any intervening 
 * characters.
 * 
 * For example, given:
 * S: "barfoothefoobarman"
 * L: ["foo", "bar"]
 * 
 * You should return the indices: [0,9].
 * (order does not matter).
 * 
 * @author Johnny
 */
public class Solution030 {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(s == null || s.length()==0 || words == null || words.length == 0){
            return result;
        } 

        //frequency of words
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String w: words){
            if(map.containsKey(w)){
                map.put(w, map.get(w)+1);
            }else{
                map.put(w, 1);
            }
        }

        int len = words[0].length();

        for(int j=0; j<len; j++){
            HashMap<String, Integer> currentMap = new HashMap<String, Integer>();
            int start = j;//start index of start
            int count = 0;//count totoal qualified words so far

            for(int i=j; i<=s.length()-len; i=i+len){
                String sub = s.substring(i, i+len);
                if(map.containsKey(sub)){
                    //set frequency in current map
                    if(currentMap.containsKey(sub)){
                        currentMap.put(sub, currentMap.get(sub)+1);
                    }else{
                        currentMap.put(sub, 1);
                    }

                    count++;

                    while(currentMap.get(sub)>map.get(sub)){
                        String left = s.substring(start, start+len);
                        currentMap.put(left, currentMap.get(left)-1);

                        count--;
                        start = start + len;
                    }


                    if(count==words.length){
                        result.add(start); //add to result

                        //shift right and reset currentMap, count & start point         
                        String left = s.substring(start, start+len);
                        currentMap.put(left, currentMap.get(left)-1);
                        count--;
                        start = start + len;
                    }
                }else{
                    currentMap.clear();
                    start = i+len;
                    count = 0;
                }
            }
        }

        return result;
    }
}
