package johnny.leetcode.algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Longest Word in Dictionary through Deleting
 * 
 * Given a string and a string dictionary, find the longest string in the 
 * dictionary that can be formed by deleting some characters of the given 
 * string. If there are more than one possible results, return the longest 
 * word with the smallest lexicographical order. If there is no possible 
 * result, return the empty string.
 * 
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * 
 * Output: 
 * "apple"
 * 
 * Example 2:
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * 
 * Output: 
 * "a"
 * 
 * Note:
 * 1. All the strings in the input will only contain lower-case letters.
 * 2. The size of the dictionary won't exceed 1,000.
 * 3. The length of all the strings in the input won't exceed 1,000.
 * 
 * @author Johnny
 */
public class Solution524 {
    // O(n*l), n is the size of the list, l is the average length of strings in list d.
    public String findLongestWord2(String s, List<String> d) {
        if (s == null || s.length() == 0 || d == null || d.size() == 0) {
            return "";
        }
        
        String longest = "";
        for (String dictWord : d) {
            int i = 0;
            for (char c : s.toCharArray()) {
                if (i >= dictWord.length()) {
                    break;
                }
                if (c == dictWord.charAt(i)) {
                    i++;
                }
            }

            if (i == dictWord.length()) {
                if (longest == "" || dictWord.length() > longest.length()) {
                    longest = dictWord;
                } else {
                    if (dictWord.length() == longest.length() && dictWord.compareTo(longest) < 0) {
                        longest = dictWord;
                    }
                }
            }
        }
        return longest;
    }

    // Sorting, O(nlog(n)), n is the size of list
    public String findLongestWord(String s, List <String> d) {
        Collections.sort(d, new Comparator < String > () {
            public int compare(String s1, String s2) {
                // sort by length first, then by letters
                return s2.length() != s1.length() ? s2.length() - s1.length() : s1.compareTo(s2);
            }
        });
        for (String str: d) {
            if (isSubsequence(str, s)) {
                return str;
            }
        }
        return "";
    }
    
    private boolean isSubsequence(String str, String s) {
        int j = 0;
        for (int i = 0; i < s.length() && j < str.length(); i++) {
            if (str.charAt(j) == s.charAt(i)) {
                j++;
            }
        }
        return j == str.length();
    }
}
