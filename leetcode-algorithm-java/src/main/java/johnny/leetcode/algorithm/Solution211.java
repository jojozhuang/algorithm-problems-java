package johnny.leetcode.algorithm;

import java.util.HashMap;
import johnny.algorithm.common.TrieNode;

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
    /*
     * public class WordDictionary {
    public class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String item = "";
    }
    
    private TrieNode root = new TrieNode();

    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.item = word;
    }

    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }
    
    private boolean match(char[] chs, int k, TrieNode node) {
        if (k == chs.length) return !node.item.equals("");   
        if (chs[k] != '.') {
            return node.children[chs[k] - 'a'] != null && match(chs, k + 1, node.children[chs[k] - 'a']);
        } else {
            for (int i = 0; i < node.children.length; i++) {
                if (node.children[i] != null) {
                    if (match(chs, k + 1, node.children[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
     */
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
