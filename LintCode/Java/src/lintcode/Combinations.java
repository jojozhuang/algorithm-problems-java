/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n <= 0 || k <= 0) {
            return res;
        }

        helper(n, 1, k, new ArrayList<Integer>(), res);

        return res;
    }

    private void helper(int n, int pos, int k, List<Integer> list,
                             List<List<Integer>> res) {
        if (list.size() >= k) {
            if (list.size() == k) {
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }

        for (int i = pos; i <= n; i++) {
            list.add(i);
            helper(n, i + 1, k, list, res);
            list.remove(list.size() - 1);
        }
    }
}
