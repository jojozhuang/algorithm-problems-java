package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 5176. Number of Valid Words for Each Puzzle
 * <p>
 * With respect to a given puzzle string, a word is valid if both the following conditions are satisfied:
 * word contains the first letter of puzzle.
 * For each letter in word, that letter is in puzzle.
 * For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage"; while invalid words are "beefed" (doesn't include "a") and "based" (includes "s" which isn't in the puzzle).
 * Return an array answer, where answer[i] is the number of words in the given word list words that are valid with respect to the puzzle puzzles[i].
 * <p>
 * <p>
 * Example :
 * <p>
 * Input:
 * words = ["aaaa","asas","able","ability","actt","actor","access"],
 * puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
 * Output: [1,1,3,2,4,0]
 * Explanation:
 * 1 valid word for "aboveyz" : "aaaa"
 * 1 valid word for "abrodyz" : "aaaa"
 * 3 valid words for "abslute" : "aaaa", "asas", "able"
 * 2 valid words for "absoryz" : "aaaa", "asas"
 * 4 valid words for "actresz" : "aaaa", "asas", "actt", "access"
 * There're no valid words for "gaswxyz" cause none of the words in the list contains letter 'g'.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 10^5
 * 4 <= words[i].length <= 50
 * 1 <= puzzles.length <= 10^4
 * puzzles[i].length == 7
 * words[i][j], puzzles[i][j] are English lowercase letters.
 * Each puzzles[i] doesn't contain repeated characters.
 *
 * @author Johnny
 */
public class SolutionA1178 {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < puzzles.length; i++) {
            char[] letters = puzzles[i].toCharArray();
            int[] map = new int[26];
            for (char c : letters) {
                map[c - 'a']++;
            }

            int count = 0;
            for (String word : words) {
                Set<Character> set = new HashSet<>();
                for (int j = 0; j < word.length(); j++) {
                    set.add(word.charAt(j));
                }
                boolean firstLetter = false;
                boolean match = true;
                Character[] wordLetters = set.toArray(new Character[set.size()]);
                for (Character c : wordLetters) {
                    if (c == puzzles[i].charAt(0)) {
                        firstLetter = true;
                    }
                    if (map[c - 'a'] == 0) {
                        match = false;
                        break;
                    }
                }
                if (firstLetter && match) {
                    count++;
                }
            }

            ans.add(count);
        }

        return ans;
    }

    public List<Integer> findNumOfValidWords2(String[] words, String[] puzzles) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < puzzles.length; i++) {
            char[] letters = puzzles[i].toCharArray();
            Arrays.sort(letters);
            String sorted = String.valueOf(letters);
            Trie trie = new Trie();
            trie.insert(sorted);

            int count = 0;
            for (String word : words) {
                Set<Character> set = new HashSet<>();
                for (int j = 0; j < word.length(); j++) {
                    set.add(word.charAt(j));
                }
                boolean firstLetter = false;
                Character[] wordLetters = set.toArray(new Character[set.size()]);
                StringBuilder sb = new StringBuilder();
                for (Character c : wordLetters) {
                    if (c == puzzles[i].charAt(0)) {
                        firstLetter = true;
                    }
                    sb.append(c);
                }
                String sortedWord = sb.toString();
                if (firstLetter && trie.startsWith(sortedWord)) {
                    count++;
                }
            }

            ans.add(count);
        }

        return ans;
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        public TrieNode getRoot() {
            return this.root;
        }

        // Return true if the word is in trie
        public boolean search(String word) {
            TrieNode tn = searchNode(word);
            //if (tn != null && tn.leaf) {
            if (tn != null) {
                return true;
            } else {
                return false;
            }
        }

        // Return true if there is any word in trie that starts with the given prefix
        public boolean startsWith(String prefix) {
            if (searchNode(prefix) == null) {
                return false;
            } else {
                return true;
            }
        }

        // Return all words which start with the given prefix
        public List<String> searchWords(String prefix) {
            TrieNode current = root;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < prefix.length(); i++) {
                char ch = prefix.charAt(i);
                if (!current.children.containsKey(ch)) {
                    return null;
                } else {
                    sb.append(ch);
                    current = current.children.get(ch);
                }
            }

            List<String> list = new ArrayList<>();
            dfs(current, sb.toString(), list);

            return list;
        }

        private void dfs(TrieNode node, String prefix, List<String> list) {
            if (node.leaf) {
                list.add(prefix);
            }
            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                dfs(entry.getValue(), prefix + entry.getKey(), list);
            }
        }

        private TrieNode searchNode(String str) {
            TrieNode current = root;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (current.children.containsKey(ch)) {
                    current = current.children.get(ch);
                } else {
                    return null;
                }
            }

            return current;
        }

        // Insert a word into trie
        public void insert(String word) {
            TrieNode current = root;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!current.children.containsKey(ch)) {
                    current.children.put(ch, new TrieNode());
                }
                current = current.children.get(ch);
            }

            current.leaf = true;
        }
    }

    class TrieNode {
        public Map<Character, TrieNode> children;
        public boolean leaf; // isWord, isLeaf, isComplete, endOfWord

        public TrieNode() {
            children = new HashMap<>();
            leaf = false;
        }
    }
}