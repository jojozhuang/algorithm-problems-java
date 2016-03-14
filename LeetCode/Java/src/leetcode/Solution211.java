/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;
import leetcode.common.TrieNode;

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
 * @author RZHUANG
 */
public class Solution211 {
    private TrieNode root = new TrieNode();
    
    // similar to solution 208
    // Adds a word into the data structure.
    public void addWord(String word) {
        HashMap<Character, TrieNode> children = root.children;
 
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
 
            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new TrieNode(c);
                children.put(c, t);
            }
 
            children = t.children;
 
            //set leaf node
            if(i == word.length() - 1) {
                t.isLeaf = true;    
            }
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return dfs(word, root);
    }
    
    private boolean dfs(String word, TrieNode t) {
        if (t == null) {
            return false;
        }
        if (word.isEmpty()) {
            return t.isLeaf;
        }
        
        HashMap<Character, TrieNode> children = t.children;

        TrieNode tn = null;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (c == '.') {
                if (i == word.length() - 1) {
                    return t.isLeaf;
                }
                for(TrieNode trie: children.values()) {
                    if(dfs(word.substring(1), trie)) {
                        return true;
                    }
                }
            } else {
                if (children.containsKey(c)){
                    tn = children.get(c);
                    children = tn.children;                    
                } else{
                    return false;
                }
            }
        }
        return tn.isLeaf;
    }
}
