/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import johnny.algorithm.leetcode.common.TrieNode;

/**
 * Add and Search Word - Data structure design.
 * 
 * Design a data structure that supports the following two operations:\
 * 
 * void addWord(word)
 * bool search(word)
 * 
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 * 
 * For example:
 * 
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * 
 * @author Johnny
 */
public class Solution211 {
    private TrieNode root = new TrieNode();
    
    // similar to solution 208
    // Adds a word into the data structure.
    public void addWord(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }

        HashMap<Character, TrieNode> children = root.children;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!children.containsKey(c)) {
                children.put(c, new TrieNode(c));
            }
            TrieNode curr = children.get(c);
            if (i == word.length() - 1) {
                curr.isLeaf = true;
            }
            children = curr.children;
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return dfs(word, root);
    }
    
    private boolean dfs(String word, TrieNode curr) {
        if (curr == null) {
            return false;
        }
        if (word.isEmpty()) {
            return curr.isLeaf;
        }
        
        TrieNode res = null;
        HashMap<Character, TrieNode> children = curr.children;
        if (children.isEmpty()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                if (i == word.length() - 1) {
                    for (TrieNode node : children.values()) {
                        if(node.isLeaf) {
                            return true;
                        }
                    }
                    return false;
                } else {
                    for (TrieNode node : children.values()) {
                        if(dfs(word.substring(i + 1), node)) {
                            return true;
                        }
                    }
                    return false;
                }
            } else {
                if (!children.containsKey(c)) {
                    return false;
                }
                res = children.get(c);
                children = res.children;
            }
        }

        return res.isLeaf;
    }
}
