package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Array Nesting
 * <p>
 * A zero-indexed array A consisting of N different integers is given. The array
 * contains all integers in the range [0, N - 1].
 * <p>
 * Sets S[K] for {@code 0 <= K < N} are defined as follows:
 * <p>
 * S[K] = { A[K], A[A[K]], A[A[A[K]]], ... }.
 * <p>
 * Sets S[K] are finite for each K and should NOT contain duplicates.
 * <p>
 * Write a function that given an array A consisting of N integers, return the
 * size of the largest set S[K] for this array.
 * <p>
 * Example 1:
 * Input: A = [5,4,0,3,1,6,2]
 * Output: 4]
 * <p>
 * Explanation:
 * A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
 * <p>
 * One of the longest S[K]:
 * S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 * <p>
 * Note:
 * N is an integer within the range [1, 20,000].
 * The elements of A are all distinct.
 * Each element of array A is an integer within the range [0, N-1].
 *
 * @author Johnny
 */
public class Solution565 {
//s0 = 0,5,6,2
//s1 = 1,4
//s2 = 2,0,5,6
//s3 = 3
//s4 = 4,1
//s5 = 5,6,2,0
//s6 = 6,2,0,5

    public int arrayNesting(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        DSU dsu = new DSU(n);

        for (int i = 0; i < n; i++) {
            dsu.union(nums[i], i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dsu.parents.length; i++) {
            int root = dsu.find(dsu.parents[i]);
            map.put(root, map.getOrDefault(root, 0) + 1);
        }

        int ans = 0;
        for (Integer val : map.values()) {
            ans = Math.max(ans, val);
        }

        return ans;
    }

    public int arrayNesting2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 0;
        int[] group = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (group[i] != 0) {
                continue;
            }
            Set<Integer> set = new HashSet<Integer>();
            int count = 0;
            int j = i;
            while (j < nums.length && !set.contains(nums[j])) {
                set.add(nums[j]);
                j = nums[j];
                count++;
            }
            res = Math.max(res, count);
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int index = it.next();
                if (index < group.length) {
                    group[index] = count;
                }
            }
        }

        return res;
    }

    class DSU {
        public int[] parents;

        public DSU(int capacity) {
            parents = new int[capacity];
            for (int i = 0; i < parents.length; i++) {
                parents[i] = i;
            }
        }

        public int find(int i) {
            if (parents[i] != i) {
                return find(parents[i]);
            }

            return parents[i];
        }

        public void union(int i, int j) {
            int p1 = find(i);
            int p2 = find(j);
            parents[p1] = p2;
        }
    }
}
