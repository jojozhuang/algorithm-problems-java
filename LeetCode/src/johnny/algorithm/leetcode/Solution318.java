package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Maximum Product of Word Lengths.
 * 
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) 
 * where the two words do not share common letters. You may assume that each 
 * word will contain only lower case letters. If no such two words exist, return 0.
 * 
 * Example 1:
 * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 * Return 16
 * The two words can be "abcw", "xtfn".
 * 
 * Example 2:
 * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 * Return 4
 * The two words can be "ab", "cd".
 * 
 * Example 3:
 * Given ["a", "aa", "aaa", "aaaa"]
 * Return 0
 * No such pair of words.
 * 
 * @author Johnny
 */
public class Solution318 {
    // Mask, convert word to binary bits
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }
        
        Arrays.sort(words, new Comparator<String>(){
            public int compare(String a, String b){
                return b.length() - a.length();
            }
        });
        
        int n = words.length;
        int[] masks = new int[n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < words[i].length(); j++){
                // Convert to int which has 26 bits
                masks[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
 
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0)
                    ans = Math.max(ans, words[i].length() * words[j].length());
            }
        }
        return ans;
    }
}
