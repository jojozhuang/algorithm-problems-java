package johnny.leetcode.algorithm;

/**
 * Compare Version Numbers.
 * Compare two version numbers version1 and version2.
 * If version1 is greater version2 return 1, if version1 is smaller version2 return -1,
 * otherwise return 0.
 * <p>
 * You may assume that the version strings are non-empty and contain
 * only digits and the . character.
 * The . character does not represent a decimal point and is used to
 * separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version
 * three", it is the fifth second-level revision of the second
 * first-level revision.
 * <p>
 * Here is an example of version numbers ordering:
 * {@code 0.1 < 1.1 < 1.2 < 13.37}
 *
 * @author Johnny
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        for (int i = 0; i < Math.min(str1.length, str2.length); i++) {
            int result = compare(str1[i], str2[i]);
            if (result != 0) {
                return result;
            }
        }

        if (str1.length < str2.length) {
            for (int i = str1.length; i < str2.length; i++) {
                if (!allzero(str2[i])) {
                    return -1;
                }
            }
        } else if (str1.length > str2.length) {
            for (int i = str2.length; i < str1.length; i++) {
                if (!allzero(str1[i])) {
                    return 1;
                }
            }
        }

        return 0;
    }

    private int compare(String v1, String v2) {
        Integer num1 = Integer.parseInt(v1);
        Integer num2 = Integer.parseInt(v2);
        return num1.compareTo(num2);
    }

    private boolean allzero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return false;
            }
        }

        return true;
    }

    public int compareVersion3(String version1, String version2) {
        if (version1 == null || version2 == null || version1.isEmpty() || version2.isEmpty()) {
            return 0;
        }

        int len1 = version1.length();
        int len2 = version2.length();
        int val1 = 0;
        int val2 = 0;
        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            while (i < len1 && version1.charAt(i) != '.') {
                val1 = val1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < len2 && version2.charAt(j) != '.') {
                val2 = val2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (val1 < val2) {
                return -1;
            } else if (val1 > val2) {
                return 1;
            } else {
                val1 = 0;
                val2 = 0;
                i++;
                j++;
            }
        }

        return 0;
    }

    public int compareVersion2(String version1, String version2) {
        if (version1 == null || version1.isEmpty() || version2 == null || version2.isEmpty()) {
            return 0;
        }

        String[] list1 = version1.split("\\.");
        String[] list2 = version2.split("\\.");

        int i = 0, j = 0;
        while (i < list1.length && j < list2.length) {
            int v1 = Integer.parseInt(list1[i]);
            int v2 = Integer.parseInt(list2[j]);
            if (v1 > v2)
                return 1;
            else if (v1 < v2)
                return -1;
            else {
                i++;
                j++;
            }
        }

        if (i < list1.length && j == list2.length) {
            for (int k = i; k < list1.length; k++) {
                int temp = Integer.parseInt(list1[k]);
                if (temp != 0)
                    return 1;
            }
            return 0;
        } else if (i == list1.length && j < list2.length) {
            for (int k = i; k < list2.length; k++) {
                int temp = Integer.parseInt(list2[k]);
                if (temp != 0)
                    return -1;
            }
            return 0;
        }

        return 0;
    }
}
