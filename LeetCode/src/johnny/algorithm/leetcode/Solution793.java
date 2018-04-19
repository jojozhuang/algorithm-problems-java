package johnny.algorithm.leetcode;

/**
 *793. Preimage Size of Factorial Zeroes Function
Let f(x) be the number of zeroes at the end of x!. (Recall that x! = 1 * 2 * 3 * ... * x, and by convention, 0! = 1.)

For example, f(3) = 0 because 3! = 6 has no zeroes at the end, while f(11) = 2 because 11! = 39916800 has 2 zeroes at the end. Given K, find how many non-negative integers x have the property that f(x) = K.

Example 1:
Input: K = 0
Output: 5
Explanation: 0!, 1!, 2!, 3!, and 4! end with K = 0 zeroes.

Example 2:
Input: K = 5
Output: 0
Explanation: There is no x such that x! ends in K = 5 zeroes.
Note:

K will be an integer in the range [0, 10^9].
 * @author Johnny
 */
public class Solution793 {
    public int preimageSizeFZF(int K) {
        return (int)(binarySearch(K) - binarySearch(K - 1));
    }
        
    private long binarySearch(int K) {
        long l = 0, r =  5L * (K + 1);
        
        while (l <= r) {
            long m = l + (r - l) / 2;
            long k = numOfTrailingZeros(m);
            
            if (k <= K) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        
        return r;
    }
    
    private long numOfTrailingZeros(long x) {
        long res = 0;
            
        for (; x > 0; x /= 5) {
            res += x/5;
        }
            
        return res;
    }
}
