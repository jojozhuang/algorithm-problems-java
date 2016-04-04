/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author RZHUANG
 */
public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (S == null || S.length == 0) {
            return res;
        }

        Arrays.sort(S);

        dfs(S, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void dfs(int[] S, int pos, ArrayList<Integer> list,
                     ArrayList<ArrayList<Integer>> res) {
        res.add(new ArrayList<Integer>(list));

        for (int i = pos; i < S.length; i++) {
            list.add(S[i]);
            dfs(S, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
