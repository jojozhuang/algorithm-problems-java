package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        
        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (Character c : A.toCharArray()) {
                if (set.contains(c)) {
                    return true;
                } else {
                    set.add(c);
                }
            }
            
            return false;
        }
        
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff.add(i);
            }
        }
        
        return diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1)) && A.charAt(diff.get(1)) ==  B.charAt(diff.get(0));
    }
}
