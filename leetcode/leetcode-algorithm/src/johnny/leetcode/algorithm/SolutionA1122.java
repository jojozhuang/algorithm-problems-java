package johnny.leetcode.algorithm;

import com.sun.tools.javac.util.ArrayUtils;

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
    // relative sort
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        Integer[] sorted = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sorted[i] = arr1[i];
        }
        Arrays.sort(sorted, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                int c1 = -1;
                if (!map.containsKey(i1)) {
                    c1 = i1 + 1000;
                } else {
                    c1 = map.get(i1);
                }
                int c2 = -1;
                if (!map.containsKey(i2)) {
                    c2 = i2 + 1000;
                } else {
                    c2 = map.get(i2);
                }
                return c1 - c2;
            }
        });

        return arr1;
    }

    // counting sort
    public int[] relativeSortArray3(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int i = 0;
        // build head
        for(int num : arr2) {
            while(count[num]-- > 0) {
                arr1[i++] = num;
            }
        }
        // build tail
        for(int n = 0; n < count.length; n++) {
            while(count[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }

    // set + map + list
    public int[] relativeSortArray2(int[] arr1, int[] arr2) {
        // convert arr2 to set
        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }

        // build map to store count of element in arr1
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (!set.contains(num)) {
                list.add(num);
            }
        }

        // put numbers which are not in arr2 to the tail of arr1
        Collections.sort(list);
        int j = arr1.length - 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            arr1[j--] = list.get(i);
        }

        // rebuild head of arr1
        j = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < map.get(arr2[i]); k++) {
                arr1[j++] = arr2[i];
            }
        }

        return arr1;
    }
}
