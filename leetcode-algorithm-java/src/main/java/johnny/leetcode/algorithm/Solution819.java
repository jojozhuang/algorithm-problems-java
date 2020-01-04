package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 819. Most Common Word
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 * <p>
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
 * <p>
 * Example:
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= paragraph.length <= 1000.
 * 1 <= banned.length <= 100.
 * 1 <= banned[i].length <= 10.
 * The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)
 * paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * Different words in paragraph are always separated by a space.
 * There are no hyphens or hyphenated words.
 * Words only consist of letters, never apostrophes or other punctuation symbols.
 *
 * @author Johnny
 */
public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<String>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        int j = -1;

        paragraph = paragraph.toLowerCase();
        while (i < paragraph.length()) {
            char c = paragraph.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (j == -1) {
                    j = i;
                }
            } else {
                if (j != -1) {
                    String s = paragraph.substring(j, i);
                    if (!set.contains(s)) {
                        map.put(s, map.getOrDefault(s, 0) + 1);
                    }
                    j = -1;
                }
            }
            i++;
        }

        if (j != -1) {
            String s = paragraph.substring(j, i);
            if (!set.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        int max = 0;
        String ans = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                ans = s;
            }
        }

        return ans;
    }

    public String mostCommonWord2(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0) {
            return "";
        }
        paragraph += ".";

        Set<String> banSet = new HashSet<String>();
        for (String word : banned) {
            banSet.add(word);
        }

        Map<String, Integer> wordMap = new HashMap<String, Integer>();

        String res = "";
        int freqMax = 0;

        StringBuilder word = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String finalword = word.toString();
                if (!banSet.contains(finalword)) {
                    wordMap.put(finalword, wordMap.getOrDefault(finalword, 0) + 1);
                    if (wordMap.get(finalword) > freqMax) {
                        res = finalword;
                        freqMax = wordMap.get(finalword);
                    }
                }
                word = new StringBuilder();
            }
        }

        return res;
    }
}
