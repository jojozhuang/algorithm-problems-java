package johnny.algorithm.leetcode;

/**
 * Maximum XOR of Two Numbers in an Array.
 * 
 * Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 231.
 * 
 * Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.
 * 
 * Could you do this in O(n) runtime?
 * 
 * Example:
 * Input: [3, 10, 5, 25, 2, 8]
 * Output: 28
 * Explanation: The maximum result is 5 ^ 25 = 28.
 * 
 * @author Johnny
 */
public class Solution421 {
    class TrieNode {
        TrieNode zero;
        TrieNode one;
    }

    public int findMaximumXOR(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        TrieNode root = new TrieNode();
        // build tree
        for (int i : nums) {
            TrieNode node = root;
            for (int j = 31; j >= 0; j--) {
                int bit = (i >> j) & 1;
                if (bit == 1) {
                    if (node.one == null) {
                        node.one = new TrieNode();
                    }
                    node = node.one;
                } else {
                    if (node.zero == null) {
                        node.zero = new TrieNode();
                    }
                    node = node.zero;
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            TrieNode node = root;
            int XOR = 0;
            for (int j = 31; j >= 0; j--) {
                int bit = (i >> j) & 1;
                if (bit == 1) {
                    if (node.zero != null) {
                        node = node.zero;
                        XOR += 1 << j;
                    } else {
                        node = node.one;
                        XOR += 0 << j;
                    }
                } else {
                    if (node.one != null) {
                        node = node.one;
                        XOR += 1 << j;
                    } else {
                        node = node.zero;
                        XOR += 0 << j;
                    }
                }
            }
            max = max > XOR ? max : XOR;
        }

        return max;
    }
    
    /*
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for(int prefix : set){
                if(set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }*/
}
