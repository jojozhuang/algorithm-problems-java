package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new LinkedList<String>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        return word_Break(s, wordDict, 0, new HashMap<>());
    }
 
    public List<String> word_Break(String s, List<String> wordDict, int start, HashMap<Integer, List<String>> map) {
        if (map.containsKey(start)) {
            return map.get(start);
        }
        LinkedList<String> res = new LinkedList<>();
        if (start == s.length()) {
            res.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))) {
                List<String> list = word_Break(s, wordDict, end, map);
                for (String l : list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        map.put(start, res);
        return res;
    }
    //http://www.programcreek.com/2014/03/leetcode-word-break-ii-java/
    /*public List<String> wordBreak(String s, Set<String> dict) {
        List<String> res = new ArrayList<String>();
        if (s == null || s.isEmpty()) {
            return res;
        }
        
        List<String> list = new ArrayList();
        helper(s, dict, 0, list, res);
        
        return res;
    }
    
    private void helper(String s, Set<String> dict, int pos, List<String> list, List<String> res) {
        if (pos >= s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String str: list) {
                sb.append(str);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            res.add(sb.toString());
            return;
        } 
        
        for (int i = pos; i < s.length(); i++) {
            int j = 1;
            boolean newword = false;
            String str = "";
            while(i + j <= s.length()) {
                str = s.substring(i, i + j);
                if (dict.contains(str)) {
                    newword = true;                    
                    break;
                }
                j++;
            }
            if (newword) {
                list.add(str);
                helper(s, dict, pos + j, list, res);
                list.remove(list.size() - 1);
                pos -= j;
            }        
        }
    }*/
    
    
    public List<String> wordBreak2(String s, List<String> dict) {
        List<String> result = new LinkedList<String>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        //create an array of ArrayList<String>
        List<String> dp[] = new ArrayList[s.length()+1];
        dp[0] = new ArrayList<String>();

        for(int i=0; i<s.length(); i++){
            if( dp[i] == null ) 
                continue; 

            for(String word:dict){
                int len = word.length();
                int end = i+len;
                if(end > s.length()) 
                    continue;

                if(s.substring(i,end).equals(word)){
                    if(dp[end] == null){
                        dp[end] = new ArrayList<String>();
                    }
                    dp[end].add(word);
                }
            }
        }
        
        if(dp[s.length()] == null) 
            return result; 

        ArrayList<String> temp = new ArrayList<String>();
        dfs(dp, s.length(), result, temp);

        return result;
    }

    private void dfs(List<String> dp[],int end,List<String> result, ArrayList<String> tmp){
        if(end <= 0){
            String path = tmp.get(tmp.size()-1);
            for(int i=tmp.size()-2; i>=0; i--){
                path += " " + tmp.get(i) ;
            }

            result.add(path);
            return;
        }

        for(String str : dp[end]){
            tmp.add(str);
            dfs(dp, end-str.length(), result, tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
