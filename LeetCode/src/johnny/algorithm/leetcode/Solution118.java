package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle.
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5, * 
 * Return
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * 
 * @author Johnny
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return res;
        }
        
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            // The first row element is always 1.
            list.add(1);
            List<Integer> previous = res.get(i - 1);
            for (int j = 1; j < previous.size(); j++) {
                list.add((previous.get(j - 1) + previous.get(j)));
            }
            // The last row element is always 1.
            list.add(1);
            res.add(list);
        }
        
        return res;
    }
}
