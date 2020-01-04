package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Johnny
 */
public class SolutionA1196 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min) {
                min = Math.abs(arr[i] - arr[i - 1]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }

        return ans;
    }
}
