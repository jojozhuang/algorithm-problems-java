package johnny.leetcode.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class SolutionA3005 {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int median = arr[(n-1)/2];

        Integer[] arr2 = new Integer[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2, (a, b)->{
            int abs1 = Math.abs(a-median);
            int abs2 = Math.abs(b-median);
            if (abs1 == abs2) {
                return b - a;
            } else {
                return abs2 - abs1;
            }
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }

    List<String> list;
    int index =-1;
    public SolutionA3005(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        index = 0;
    }

    public void visit(String url) {
        if (index != list.size() - 1) {
            list = list.subList(0, index);
        }
        list.add(url);
        index = list.size() - 1;
    }

    public String back(int steps) {
        index -= steps;
        if (index < 0) {
            index = 0;
        }
        return list.get(index);
    }

    public String forward(int steps) {
        index += steps;
        if (index >= list.size()) {
            index = list.size() - 1;
        }
        return list.get(index);
    }
}
