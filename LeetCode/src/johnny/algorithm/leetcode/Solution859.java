package johnny.algorithm.leetcode;

/**
 * 859. Buddy Strings
 * 
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.

 

Example 1:

Input: A = "ab", B = "ba"
Output: true
Example 2:

Input: A = "ab", B = "ab"
Output: false
Example 3:

Input: A = "aa", B = "aa"
Output: true
Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
Example 5:

Input: A = "", B = "aa"
Output: false
 

Note:

0 <= A.length <= 20000
0 <= B.length <= 20000
A and B consist only of lowercase letters.

 * @author Johnny
 */
public class Solution859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() == 0 && B.length() == 0) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        
        boolean allsame = true;
        char firstLetter = A.charAt(0);
        int diff = 0;
        int first = -1;
        int second = -1;
        
        int i = 0;
        int j = 0;
        while(i < A.length() && j < B.length()) {
            if (A.charAt(i) != firstLetter || B.charAt(i) != firstLetter) {
                allsame = false;
            }
            char ch1 = A.charAt(i);
            char ch2 = B.charAt(j);
            if (ch1 == ch2) {
                i++;
                j++;
            } else {
                if (diff >= 2) {
                    return false;
                } else {
                    diff++;
                    if (diff == 1) {
                        first = i;
                    } else {
                        second = i;
                    }
                    i++;
                    j++;
                }
            }
        }
        
        if (allsame) {
            return true;
        }
        
        if (diff != 2) {
            return false;
        }
        
        if (A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first)) {
            return true;
        } else {
            return false;
        }
    }
}
