package johnny.leetcode.algorithm;

import java.util.*;

/**
 * 1122. Relative Sort Array
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
 

Constraints:

arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
Each arr2[i] is distinct.
Each arr2[i] is in arr1.

 * @author Johnny
 */
public class SolutionA1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // convert arr2 to set
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // build map to store count of element in arr1
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (set.contains(arr1[i])) {
                map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
                arr1[i] = -1; // mark as deleted
            } else {
                list.add(arr1[i]);
            }
        }

        // put numbers which are not in arr2 to the tail of arr1
        int j = arr1.length - 1;
        Collections.sort(list);
        for (int i = list.size() - 1; i >=0; i--) {
            arr1[j] = list.get(i);
            j--;
        }

        // rebuild head of arr1
        int i = 0;
        for (j = 0; j < arr2.length; j++) {
            for (int k = 0; k < map.get(arr2[j]); k++) {
                arr1[i] = arr2[j];
                i++;
            }
        }

        return arr1;
    }
}
