package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Keyboard Row
 * 
 * Given a List of words, return the words that can be typed using letters of 
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * American keyboard
 * 
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * @author Johnny
 */
public class Solution500 {
    public String[] findWords(String[] words) {
        int[] lineArray = new int[]{2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        
        List<String> res = new ArrayList<String>();
        if (words == null || words.length == 0) {
            return res.toArray(new String[0]);
        }
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            boolean allsame = true;
            for (int j = 1; j < word.length(); j++) {
                if (lineArray[word.charAt(j) - 'a'] != lineArray[word.charAt(j - 1) - 'a']) {
                    allsame = false;
                    break;
                }
            }
            if (allsame) {
                res.add(words[i]);
            }
        }
        
        return res.toArray(new String[0]);
    } 
}
