package johnny.leetcode.algorithm;

/**
 * 1017. Convert to Base -2
Given a number N, return a string consisting of "0"s and "1"s that represents its value in base -2 (negative two).

The returned string must have no leading zeroes, unless the string is "0".

 

Example 1:

Input: 2
Output: "110"
Explantion: (-2) ^ 2 + (-2) ^ 1 = 2
Example 2:

Input: 3
Output: "111"
Explantion: (-2) ^ 2 + (-2) ^ 1 + (-2) ^ 0 = 3
Example 3:

Input: 4
Output: "100"
Explantion: (-2) ^ 2 = 4
 

Note:

0 <= N <= 10^9

 * @author Johnny
 */
public class SolutionA1017 {
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
