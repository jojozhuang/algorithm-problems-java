package johnny.algorithm.leetcode;

/**
 * Unique Binary Search Trees.
 * Given n, how many structurally unique BST's (binary search trees) that store
 * values 1...n?
 * 
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * 
 * @author Johnny
 */
public class Solution096 {
    //https://siddontang.gitbooks.io/leetcode-solution/content/dynamic_programming/unique_binary_search_trees.html
    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // if left child has j sub trees, then right child has i - j - 1 sub trees.
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        
        return dp[n];
    }
}
