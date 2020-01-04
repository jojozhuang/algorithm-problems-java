package johnny.leetcode.algorithm;

import johnny.algorithm.common.TrieNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement Trie (Prefix Tree).
 * <p>
 * Implement a trie with insert, search, and startsWith methods.
 * <p>
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 *
 * @author Johnny
 */
public class Solution208 {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Solution208() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     * @param word word
     */
    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode t;
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                t = new TrieNode(c);
                children.put(c, t);
            }

            children = t.children;

            //set leaf node
            if (i == word.length() - 1) {
                t.isLeaf = true;
            }
        }
    }

    /**
     * Returns if the word is in the trie.
     * @param word word
     * @return result
     */
    public boolean search(String word) {
        TrieNode t = searchNode(word);

        if (t != null && t.isLeaf) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     * @param prefix prefix
     * @return result
     */
    public boolean startsWith(String prefix) {
        if (searchNode(prefix) == null) {
            return false;
        } else {
            return true;
        }
    }

    private TrieNode searchNode(String str) {
        Map<Character, TrieNode> children = root.children;
        TrieNode t = null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (children.containsKey(c)) {
                t = children.get(c);
                children = t.children;
            } else {
                return null;
            }
        }

        return t;
    }
}
