package johnny.lintcode.algorithm;

import java.util.ArrayList;

/**
 * Longest Words.
 * Given a dictionary, find all of the longest words in the dictionary.
 * 
 * Example
 * Challenge
 * Tags
 * Related Problems
 * Given
 * 
 * {
 *   "dog",
 *   "google",
 *   "facebook",
 *   "internationalization",
 *   "blabla"
 * }
 * the longest words are(is) ["internationalization"].
 * 
 * Given
 * 
 * {
 *   "like",
 *   "love",
 *   "hate",
 *   "yes"
 * }
 * the longest words are ["like", "love", "hate"].
 * 
 * @author Johnny
 */
public class LongestWords {
    public ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> ret = new ArrayList<String>();
        if (dictionary == null || dictionary.length == 0) {
            return ret;
        }
        
        for(String str: dictionary) {
            if (ret.isEmpty() || str.length() > ret.get(0).length()) {
                ret.clear();
                ret.add(str);
            } else if (str.length() == ret.get(0).length()){
                ret.add(str);
            }
        }
        
        return ret;
    }
}
