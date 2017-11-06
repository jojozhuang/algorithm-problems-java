/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Partitioning.
 * @author Johnny
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> res = new ArrayList<List<String>>();
        if (s == null || s.isEmpty()) {
            return res;
        }

        helper(s, 0, new ArrayList<String>(), res);
        return res;
    }

    private void helper(String s, int pos, List<String> list, List<List<String>> res) {
        if (pos == s.length()) {
            res.add(new ArrayList<String>(list));
            return;
        }

        for (int i = pos; i < s.length(); i++) {
            String str = s.substring(pos, i + 1);
            if (isPalindrome(str)) {
                list.add(str);
                helper(s, i + 1, list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
