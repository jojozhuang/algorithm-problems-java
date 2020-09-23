package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3052 {
    public int numTriplets(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((long)nums1[i] * (long)nums1[i] == (long)nums2[j] * (long)nums2[k]) {
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if ((long)nums2[i] * (long)nums2[i] == (long)nums1[j] * (long)nums1[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
