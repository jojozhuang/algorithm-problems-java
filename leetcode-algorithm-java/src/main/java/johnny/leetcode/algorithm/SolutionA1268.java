package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 1268. Search Suggestions System
 *
 * Given an array of strings products and a string searchWord. We want to design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with the searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.
 *
 * Return list of lists of the suggested products after each character of searchWord is typed.
 *
 *
 *
 * Example 1:
 *
 * Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
 * Output: [
 * ["mobile","moneypot","monitor"],
 * ["mobile","moneypot","monitor"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"]
 * ]
 * Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
 * After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
 * After typing mou, mous and mouse the system suggests ["mouse","mousepad"]
 * Example 2:
 *
 * Input: products = ["havana"], searchWord = "havana"
 * Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
 * Example 3:
 *
 * Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
 * Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]
 * Example 4:
 *
 * Input: products = ["havana"], searchWord = "tatiana"
 * Output: [[],[],[],[],[],[],[]]
 *
 *
 * Constraints:
 *
 * 1 <= products.length <= 1000
 * There are no repeated elements in products.
 * 1 <= Σ products[i].length <= 2 * 10^4
 * All characters of products[i] are lower-case English letters.
 * 1 <= searchWord.length <= 1000
 * All characters of searchWord are lower-case English letters.
 *
 * @author Johnny
 */
public class SolutionA1268 {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<String> productsList = Arrays.asList(products);

        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < products.length; i++) {
            map.put(products[i], i);
        }

        List<List<String>> ans = new ArrayList<>();
        String key = "";
        for (char c : searchWord.toCharArray()) {
            key += c;
            String ceiling = map.ceilingKey(key);
            String floor = map.floorKey(key + "{");
            if (ceiling == null || floor == null) {
                break;
            }
            ans.add(productsList.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1)));
        }

        while (ans.size() < searchWord.length()) {
            ans.add(new ArrayList<>());
        }
        return ans;
    }

    public List<List<String>> suggestedProducts3(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> ans = new ArrayList<>();
        for (int i = 1; i <= searchWord.length(); i++) {
            String key = searchWord.substring(0, i);
            int lower = lowerBound(products, key);
            int upper = upperBound(products, key);
            if (lower >= 0 && upper >= 0) {
                List<String> list = new ArrayList<>();
                for (int j = lower; j <= Math.min(lower + 2, upper); j++) {
                    list.add(products[j]);
                }
                ans.add(list);
            } else {
                break;
            }
        }

        if (ans.size() < searchWord.length()) {
            int size = searchWord.length() - ans.size();
            for (int i = 0; i < size; i++) {
                ans.add(new ArrayList<>());
            }
        }

        return ans;
    }

    private int lowerBound(String[] products, String key) {
        int start = 0;
        int end = products.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            String product = products[mid];
            if (product.startsWith(key)) {
                end = mid;
            } else if (product.compareTo(key) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (products[start].startsWith(key)) {
            return start;
        } else if (products[end].startsWith(key)) {
            return end;
        } else {
            return -1;
        }
    }

    private int upperBound(String[] products, String key) {
        int start = 0;
        int end = products.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            String product = products[mid];
            if (product.startsWith(key)) {
                start = mid;
            } else if (product.compareTo(key) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (products[end].startsWith(key)) {
            return end;
        } else if (products[start].startsWith(key)) {
            return start;
        } else {
            return -1;
        }
    }

    public List<List<String>> suggestedProducts2(String[] products, String searchWord) {
        Trie trie = new Trie();
        for (String product : products) {
            trie.insert(product);
        }

        List<List<String>> ans = new ArrayList<>();

        for (int i = 1; i <= searchWord.length(); i++) {
            List<String> list = new ArrayList<>();
            list = trie.searchWords(searchWord.substring(0, i));
            if (list != null && list.size() > 0) {
                Collections.sort(list);
                if (list.size() > 3) {
                    ans.add(new ArrayList<>(list.subList(0, 3)));
                } else {
                    ans.add(new ArrayList<>(list));
                }
            } else {
                ans.add(new ArrayList<>(new ArrayList<>()));
            }
        }

        return ans;
    }

    class TrieNode {
        public Map<Character, TrieNode> children;
        public boolean leaf; // isWord, isLeaf, isComplete, endOfWord

        public TrieNode() {
            children = new HashMap<>();
            leaf = false;
        }
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
            if (tn != null && tn.leaf) {
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

        public boolean delete(String word) {
            TrieNode current = root;
            TrieNode lastBranchNode = null;
            Character lastBrachChar = null;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (current.children.containsKey(ch)) {
                    if (current.children.size() > 1) {
                        lastBranchNode = current;
                        lastBrachChar = ch;
                    }
                    current = current.children.get(ch);
                } else {
                    // word not found
                    return false;
                }
            }

            if (current.children.size() > 0) {
                // case 1: The to-be deleted word is prefix of another long word in trie.
                current.leaf = false;
                return true;
            }

            if (lastBranchNode != null) {
                // case 2: The to-be deleted word has other words as prefix
                lastBranchNode.children.remove(lastBrachChar);
                return true;
            } else {
                // case 3: The to-be deleted word present as unique word
                root.children.remove(word.charAt(0));
                return true;
            }
        }
    }
}
