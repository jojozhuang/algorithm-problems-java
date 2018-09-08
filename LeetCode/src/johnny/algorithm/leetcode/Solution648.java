package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Replace Words
 * 
 * In English, we have a concept called root, which can be followed by some 
 * other words to form another longer word - let's call this word successor. 
 * For example, the root an, followed by other, which can form another word another.
 * 
 * Now, given a dictionary consisting of many roots and a sentence. You need to 
 * replace all the successor in the sentence with the root forming it. If a 
 * successor has many roots can form it, replace it with the root with the 
 * shortest length.
 * 
 * You need to output the sentence after the replacement.
 * 
 * Example 1:
 * Input: dict = ["cat", "bat", "rat"]
 * sentence = "the cattle was rattled by the battery"
 * Output: "the cat was rat by the bat"
 * 
 * Note:
 * The input will only have lower-case letters.
 * 1 <= dict words number <= 1000
 * 1 <= sentence words number <= 1000
 * 1 <= root length <= 100
 * 1 <= sentence words length <= 1000
 * 
 * @author Johnny
 */
public class Solution648 {
    // HashSet
    public String replaceWords2(List<String> dict, String sentence) {
        if (dict == null || sentence == null || sentence.isEmpty()) {
            return null;
        }
        
        Set<String> set = new HashSet<>();
        for (String word : dict) {
            set.add(word);
        }
        
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (set.contains(prefix)) {
                    break;
                }
            }
            sb.append(prefix);
            sb.append(" ");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    // Trie
    public String replaceWords(List<String> dict, String sentence) {
        String[] tokens = sentence.split(" ");
        TrieNode trie = buildTrie(dict);
        return replaceWords(tokens, trie);
    }

    private String replaceWords(String[] tokens, TrieNode root) {
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(getShortestReplacement(token, root));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String getShortestReplacement(String token, final TrieNode root) {
        TrieNode node = root;
        StringBuilder sb = new StringBuilder();
        for (char c : token.toCharArray()) {
            sb.append(c);
            if (node.children[c - 'a'] != null) {
                if (node.children[c - 'a'].isWord) {
                    return sb.toString();
                }
                node = node.children[c - 'a'];
            } else {
                return token;
            }
        }
        return token;
    }
    
    private class TrieNode {
        char val;
        TrieNode[] children;
        boolean isWord;

        public TrieNode(char val) {
            this.val = val;
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
    
    private TrieNode buildTrie(List<String> dict) {
        TrieNode root = new TrieNode(' ');
        for (String word : dict) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode(c);
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }
        return root;
    }
}
