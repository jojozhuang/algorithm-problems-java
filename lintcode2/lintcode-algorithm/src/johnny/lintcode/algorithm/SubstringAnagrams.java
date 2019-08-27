package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Substring Anagrams
 * 
 * Given a string s and a non-empty string p, find all the start indices of p's 
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both 
 * strings s and p will not be larger than 40,000.
 * 
 * The order of output does not matter.
 * 
 * Example
 * Given s = "cbaebabacd" p = "abc"
 * 
 * return [0, 6]
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 * @author Johnny
 */
public class SubstringAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if (s == null || s.isEmpty() || p == null || p.isEmpty()) {
            return res;
        }
        if (s.length() < p.length()) {
            return res;
        }
        
        char[] arrp = p.toCharArray();
        Arrays.sort(arrp);
        String sortedP = new String(arrp);
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String sub = s.substring(i, i + p.length());
            char[] arrTemp = sub.toCharArray();
            Arrays.sort(arrTemp);
            String sortedS = new String(arrTemp);
            if (sortedP.equals(sortedS)) {
                res.add(i);
            }
        }
        
        return res;
    }
}
