package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * 1021. Best Sightseeing Pair
User Accepted: 810
User Tried: 1449
Total Accepted: 831
Total Submissions: 2578
Difficulty: Medium
Given an array A of positive integers, A[i] represents the value of the i-th sightseeing spot, and two sightseeing spots i and j have distance j - i between them.

The score of a pair (i < j) of sightseeing spots is (A[i] + A[j] + i - j) : the sum of the values of the sightseeing spots, minus the distance between them.

Return the maximum score of a pair of sightseeing spots.

 

Example 1:

Input: [8,1,5,2,6]
Output: 11
Explanation: i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 

Note:

2 <= A.length <= 50000
1 <= A[i] <= 1000

 * @author Johnny
 */
public class SolutionA1028 {
    public String baseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        
        int negBase = -2;

        String converted = ""; 
        while (N != 0) { 
            // Get remainder by negative base, it can be negative also 
            int remainder = N % negBase; 
            N /= negBase; 

            // if remainder is negative, add abs(base) to it and add 1 to n 
            if (remainder < 0) { 
                remainder += (-negBase); 
                N += 1; 
            } 

            // convert remainder to string add into the result 
            converted = remainder + converted; 
        }
        
        return converted;
    }
}
