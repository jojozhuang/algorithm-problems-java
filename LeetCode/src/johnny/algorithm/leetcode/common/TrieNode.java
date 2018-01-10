package johnny.algorithm.leetcode.common;

import java.util.HashMap;

/**
 *
 * @author Johnny
 */
public class TrieNode {
    public char c;
    public HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    public boolean isLeaf;
 
    public TrieNode() {}
 
    public TrieNode(char c){
        this.c = c;
    }
}
