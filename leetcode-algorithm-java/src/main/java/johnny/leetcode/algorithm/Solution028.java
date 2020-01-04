package johnny.leetcode.algorithm;

/**
 * Implement strStr().
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1
 * if needle is not part of haystack.
 *
 * @author Johnny
 */
public class Solution028 {
    public int strStr2(String haystack, String needle) {
        if (haystack == null || needle == null ||
                haystack.length() < needle.length()) {
            return -1;
        }

        int j = 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length() || haystack.length() == 0) return -1;
        char[] ndl = needle.toCharArray();
        char[] hay = haystack.toCharArray();
        int[] pai = new int[ndl.length];
        pai[0] = -1;
        int k = -1;
        for (int i = 1; i < ndl.length; i++) {
            while (k > -1 && ndl[k + 1] != ndl[i]) {
                k = pai[k];
            }
            if (ndl[k + 1] == ndl[i]) {
                k++;
            }
            pai[i] = k;

        }
        k = -1;
        for (int i = 0; i < hay.length; i++) {
            while (k > -1 && ndl[k + 1] != hay[i]) {
                k = pai[k];
            }
            if (ndl[k + 1] == hay[i]) {
                k++;
                if (k == ndl.length - 1) {
                    return i - k;
                }
            }
        }
        return -1;
    }
}
