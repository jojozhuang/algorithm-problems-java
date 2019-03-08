package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Word Ladder.
 * Given two words (start and end), and a dictionary, find the length of 
 * shortest transformation sequence from start to end, such that:
 * 
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * 
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * 
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * 
 * @author Johnny
 */
public class Solution127 {
    // bfs with queue
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.isEmpty() || endWord.isEmpty() || wordList == null || wordList.isEmpty()) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int steps = 0;
        while (!queue.isEmpty()) {
            steps++;
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                String word = queue.poll();
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 'a'; j <= 'z'; j++) {
                        String newWord = word.substring(0, i) + (char)(j) + word.substring(i + 1);
                        if (newWord.equals(endWord)) {
                            return steps + 1;
                        }
                        if (!set.contains(newWord)) {
                            continue;
                        }
                        set.remove(newWord);
                        queue.offer(newWord);
                    }
                }
            }
        }
        
        return 0;
    }
    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.isEmpty() || endWord.isEmpty() || wordList == null || wordList.isEmpty()) {
            return 0;
        }
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        wordList.add(endWord);
        int distance = 1;
        while (!reached.contains(endWord)) {
            Set<String> toAdd = new HashSet<String>();
            for (String each : reached) {
                for (int i = 0; i < each.length(); i++) {
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordList.contains(word)) {
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
            distance++;
            if (toAdd.size() == 0) return 0;
            reached = toAdd;
        }
        return distance;
    }
    
    public int ladderLength3(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.isEmpty() || endWord.isEmpty() || wordList == null || wordList.isEmpty()) {
            return 0;
        }
        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(beginWord, 1));
 
        wordList.add(endWord);
 
        while (!queue.isEmpty()){
            WordNode top = queue.poll();
            String word = top.word;
 
            if (word.equals(endWord)){
                return top.numSteps;
            }
 
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++){
                for (char c = 'a'; c <= 'z'; c++){
                    char temp = arr[i];
                    if(arr[i] != c){
                        arr[i] = c;
                    }
 
                    String newWord = new String(arr);
                    if (wordList.contains(newWord)){
                        queue.add(new WordNode(newWord, top.numSteps + 1));
                        wordList.remove(newWord);
                    }
 
                    arr[i] = temp;
                }
            }
        }
 
        return 0;
    }
    
    private class WordNode{
        String word;
        int numSteps;

        public WordNode(String word, int numSteps){
            this.word = word;
            this.numSteps = numSteps;
        }
    }
}
