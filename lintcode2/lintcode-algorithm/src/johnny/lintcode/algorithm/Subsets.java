package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Johnny
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
