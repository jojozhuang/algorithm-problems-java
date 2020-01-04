package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 859. Buddy Strings
 * <p>
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = "ab", B = "ba"
 * Output: true
 * Example 2:
 * <p>
 * Input: A = "ab", B = "ab"
 * Output: false
 * Example 3:
 * <p>
 * Input: A = "aa", B = "aa"
 * Output: true
 * Example 4:
 * <p>
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * Example 5:
 * <p>
 * Input: A = "", B = "aa"
 * Output: false
 * <p>
 * Note:
 * <pre>{@code
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters.
 * }</pre>
 * @author Johnny
 */
public class Solution859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) { // abab, abab
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

        int diff = 0;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff++;
                if (diff == 1) {
                    index1 = i;
                } else if (diff == 2) {
                    index2 = i;
                } else if (diff > 2) {
                    return false;
                }
            }
        }

        if (diff != 2) {
            return false;
        }

        if (A.charAt(index1) != B.charAt(index2) ||
                A.charAt(index2) != B.charAt(index1)) {
            return false;
        }

        return true;
    }

    public boolean buddyStrings2(String A, String B) {
        if (A.length() == 0 && B.length() == 0) {
            return false;
        }

        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) { // abab, abab
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

        // ab, ba
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff.add(i);
            }
        }

        return diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1)) && A.charAt(diff.get(1)) == B.charAt(diff.get(0));
    }
}
