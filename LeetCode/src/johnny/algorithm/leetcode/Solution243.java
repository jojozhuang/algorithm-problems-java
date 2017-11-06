/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.List;

/**
 * Shortest Word Distance.
 * 
 * Given a list of words and two words word1 and word2, return the shortest 
 * distance between these two words in the list.
 * 
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * 
 * Given word1 = "coding", word2 = "practice", return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * 
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 * 
 * The naive idea is very easy. But could you solve it in one-pass?
 * 
 * @author Johnny
 */
public class Solution243 {
    public int shortestDistance(List<String> words, String word1, String word2) {
        if (words == null || words.size() == 0 || word1 == null || word1.isEmpty() ||
                word2 == null || word2.isEmpty() || word1.equals(word2)) {
            return 0;
        }
        
        int dist = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word1)) {
                index1 = i;
            } else if (words.get(i).equals(word2)) {
                index2 = i;
            }
            
            if (index1 != -1 && index2 != -1) {
                dist = Math.min(dist, Math.abs(index1 - index2));
            }
        }
        
        return dist;    
    }
}
