/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
    public int numTrees(int n) {
        if (n < 1) {
            return 0;
        }
        
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                count[i] = count[i] + count[j] * count[i - j - 1];                
            }
        }
        
        return count[n];
    }
}
