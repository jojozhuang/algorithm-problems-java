package johnny.algorithm.leetcode;

import java.util.List;

/**
 * Shortest Word Distance III.
 * 
 * This is a follow up of Shortest Word Distance. The only difference is now 
 * word1 could be the same as word2.
 * 
 * Given a list of words and two words word1 and word2, return the shortest 
 * distance between these two words in the list.
 * word1 and word2 may be the same and they represent two individual words 
 * in the list.
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “makes”, word2 = “coding”, return 1.
 * Given word1 = "makes", word2 = "makes", return 3.
 * Note:
 * You may assume word1 and word2 are both in the list.
 * 
 * Understand the problem:
 * The problem is an extension of the previous one. The only diff is the word1 
 * and word2 can be the same. It can still be easily solved by using a hash map.
 * The question is, can we solve it by using the one-pass of the array? 
 * 
 * The key is we cannot update the two pointers simultaneously, if they are the 
 * same. We could update one, compare the distance, and then update the other. 
 * 
 * @author Johnny
 */
public class Solution245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int minDistance = Integer.MAX_VALUE;
         
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
             
            if (word.equals(word1)) {
                index1 = i;
            } else if (word.equals(word2)) {
                index2 = i;
            }
             
            if (index1 != -1 && index2 != -1 && index1 != index2) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
             
            if (word1.equals(word2)) {
                index2 = index1;
            }
        }
         
        return minDistance;
    }
    
    public int shortestDistance2(List<String> words, String word1, String word2) {
        if (words == null || words.size() == 0 || word1 == null || word1.isEmpty() ||
                word2 == null || word2.isEmpty()) {
            return 0;
        }
        
        int dist = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        
        if (word1.equals(word2)) {
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).equals(word1)) {
                    if (index1 == -1) {
                        index1 = i;
                    } else {
                        index2 = i;
                    }
                } 
                if (index1 != -1 && index2 != -1) {
                    dist = Math.min(dist, Math.abs(index1 - index2));
                    index1 = index2;
                    index2 = -1;
                }
            }
        } else {
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
        }
        
        return dist;
    }
}
