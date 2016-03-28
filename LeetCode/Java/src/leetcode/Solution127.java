/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.LinkedList;
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
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
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
