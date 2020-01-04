package johnny.lintcode.algorithm;

import java.util.HashMap;

/**
 * Add and Search Word.
 *
 * @author Johnny
 */
public class AddandSearchWord {
    private TrieNode root = new TrieNode();

    // Adds a word into the data structure.
    public void addWord(String word) {
        // Write your code here
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
        // Write your code here
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
                        if (node.isLeaf) {
                            return true;
                        }
                    }
                    return false;
                } else {
                    for (TrieNode node : children.values()) {
                        if (dfs(word.substring(i + 1), node)) {
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

    class TrieNode {
        char c;
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        boolean isLeaf;

        TrieNode() {
        }

        TrieNode(char c) {
            this.c = c;
        }
    }
}
