package johnny.cc150.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Johnny
 */
public class Trie {
    private class TrieNode {
        public Map<Character, TrieNode> children;
        public boolean leaf; // isWord, isLeaf, isComplete, endOfWord

        public TrieNode() {
            children = new HashMap<Character, TrieNode>();
            leaf = false;
        }
    }
    
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode current = root;
 
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if (!current.children.containsKey(ch)){
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        
        current.leaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode tn = searchNode(word);
        if (tn != null && tn.leaf) {
            return true;
        } else {
            return false;
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if (searchNode(prefix) == null) {
            return false;
        } else {
            return true;
        }
    }
    
    private TrieNode searchNode(String str){
        TrieNode current = root;
        
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (current.children.containsKey(ch)){
                current = current.children.get(ch);
            } else {
                return null;
            }
        }
 
        return current;
    }

    public void delete(String word) {
        
    }
}
