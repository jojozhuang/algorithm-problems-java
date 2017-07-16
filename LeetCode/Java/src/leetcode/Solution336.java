/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Palindrome Pairs.
 * 
 * Given a list of unique words. Find all pairs of distinct indices (i, j) in 
 * the given list, so that the concatenation of the two words, i.e. words[i] + 
 * words[j] is a palindrome.
 * 
 * Example 1:
 * Given words = ["bat", "tab", "cat"]
 * Return [[0, 1], [1, 0]]
 * The palindromes are ["battab", "tabbat"]
 * Example 2:
 * Given words = ["abcd", "dcba", "lls", "s", "sssll"]
 * Return [[0, 1], [1, 0], [3, 2], [2, 4]]
 * The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
 *  
 * @author Johnny
 */
public class Solution336 {
    //https://discuss.leetcode.com/category/420/palindrome-pairs
    class TrieNode {
        TrieNode[] next;
        int index;
        List<Integer> list;

        TrieNode() {
            next = new TrieNode[26];
            index = -1;
            list = new ArrayList<>();
        }
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        if (words == null || words.length == 0) {
            return res;            
        }
        TrieNode root = new TrieNode();

        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            search(words, i, root, res);
        }

        return res;
    }

    private void addWord(TrieNode root, String word, int index) {
	for (int i = word.length() - 1; i >= 0; i--) {
            if (root.next[word.charAt(i) - 'a'] == null) {
                root.next[word.charAt(i) - 'a'] = new TrieNode();
            }

            if (isPalindrome(word, 0, i)) {
                root.list.add(index);
            }

            root = root.next[word.charAt(i) - 'a'];
	}
	
	root.list.add(index);
	root.index = index;
    }

    private void search(String[] words, int i, TrieNode root, List<List<Integer>> list) {
	for (int j = 0; j < words[i].length(); j++) {	
            if (root.index >= 0 && root.index != i && isPalindrome(words[i], j, words[i].length() - 1)) {
                list.add(Arrays.asList(i, root.index));
            }

            root = root.next[words[i].charAt(j) - 'a'];
            if (root == null) return;
	}
	
	for (int j : root.list) {
            if (i == j) continue;
            list.add(Arrays.asList(i, j));
	}
    }

    private boolean isPalindrome(String word, int i, int j) {
	while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) {
                return false;
            }
	}
	
	return true;
    }
    // naive, O(n^2 * k)
    public List<List<Integer>> palindromePairs2(String[] words) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (words == null || words.length == 0) {
            return res;            
        }
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                List<List<Integer>> list = isPair(i, j, words[i], words[j]);
                res.addAll(list);
            }
        }
        
        return res;        
    }
    
    private List<List<Integer>> isPair(int i, int j, String s1, String s2) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (s1.isEmpty() && s2.isEmpty()) {
            return res;
        }
        
        if (isPalindrome(s1 + s2)) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(i);
            list.add(j);
            res.add(list);
        }
        
        if (isPalindrome(s2 + s1)) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(j);
            list.add(i);
            res.add(list);
        }
        
        return res;
    }
    
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
