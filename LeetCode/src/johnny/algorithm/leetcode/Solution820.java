package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *820. Short Encoding of Words
 *Given a list of words, we may encode it by writing a reference string S and a list of indexes A.

For example, if the list of words is ["time", "me", "bell"], we can write it as S = "time#bell#" and indexes = [0, 2, 5].

Then for each index, we will recover the word by reading from the reference string from that index until we reach a "#" character.

What is the length of the shortest reference string S possible that encodes the given words?

Example:

Input: words = ["time", "me", "bell"]
Output: 10
Explanation: S = "time#bell#" and indexes = [0, 2, 5].
Note:

1 <= words.length <= 2000.
1 <= words[i].length <= 7.
Each word has only lowercase letters.
 * @author Johnny
 */
public class Solution820 {
    public int minimumLengthEncoding(String[] words) {
        TrieNode root = new TrieNode();
        List<TrieNode> leaves = new  ArrayList<TrieNode>();
        for (String w : new HashSet<>(Arrays.asList(words))) {
            TrieNode cur = root;
            for (int i = w.length() - 1; i >= 0; --i) {
                char j = w.charAt(i);
                if (!cur.next.containsKey(j)) cur.next.put(j, new TrieNode());
                cur = cur.next.get(j);
            }
            cur.depth = w.length() + 1;
            leaves.add(cur);
        }
        int res = 0;
        for (TrieNode leaf : leaves) if (leaf.next.isEmpty()) res += leaf.depth;
        return res;
    }
    
    private class TrieNode {
        HashMap<Character, TrieNode> next = new HashMap<>();
        int depth;
    }
}
