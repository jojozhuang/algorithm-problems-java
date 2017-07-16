/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.common;

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
