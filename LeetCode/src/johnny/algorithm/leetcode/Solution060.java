package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutation Sequence.
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * 
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
 * 
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * 
 * Note: Given n will be between 1 and 9 inclusive.
 * 
 * @author Johnny
 */
public class Solution060 {
    //http://fisherlei.blogspot.com/2013/04/leetcode-permutation-sequence-solution.html
    public String getPermutation(int n, int k) {
        if (n <= 0 || k <= 0) {
            return "";
        }
        
        int fact = 1;
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            nums.add(i);
        }
        
        if (k > fact) {
            return "";
        }
        
        // get the permutation digit
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            fact /= i;
            // take care of rank and k
            int rank = (k - 1) / fact;
            k = (k - 1) % fact + 1;
            // ajust the mapping of rank to num
            sb.append(nums.get(rank));
            nums.remove(rank);
        }

        return sb.toString();
    }
}
