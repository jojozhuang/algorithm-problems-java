package johnny.leetcode.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * {@code https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=503600}
 *给一个排好序的N个不同数字，一个整数K，一个整数C，找到距离K第Cth近的数字，注意K并不一定出现在这个数组里
例如数组是{1, 3, 5, 10, 20, 23} K = 11 C = 2，那么输出为5
 *
 *
 * @author Johnny
 */
public class AAAClosestElement {
    // binary search, log(n) + klog(k)
    public int findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - k;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (x - arr[mid] > arr[mid + k]  - x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = start; i < start + k; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list, (a,b)->a==b? a-b: Math.abs(a-x)-Math.abs(b-x));
        return list.get(k-1);
    }
    // shrink with two pointers, O(n) + klog(k)
    public int findClosestElements4(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list, (a,b)->a==b? a-b: Math.abs(a-x)-Math.abs(b-x));

        return list.get(k-1);
    }
    //sorting, nlog(n)
    public int findClosestElements2(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Collections.sort(list, (a,b)->a==b? a-b: Math.abs(a-x)-Math.abs(b-x));
        return list.get(k - 1);
    }

    public int findClosestElements3(int[] arr, int k, int x) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return 0;
        }

        int start = 0;
        int end = arr.length - k;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        if (x < arr[start]) {
            return arr[start];
        } else if (x > arr[start + k - 1]) {
            return arr[start + k - 1];
        } else {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                if (Math.abs(arr[start + i] - x) < ans) {
                    ans = arr[start + i];
                }
            }
            return ans;
        }
    }
}
