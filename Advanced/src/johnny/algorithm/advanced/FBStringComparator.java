package johnny.algorithm.advanced;

import java.util.Comparator;

public class FBStringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1 == null && s2 == null)
            return 0;
         // null would be put as last
        if (s1 == null)
            return 1;
        if (s2 == null)
            return -1;
        
        int i = 0, j = 0;
        int len1 = s1.length(), len2 = s2.length();
        
        while (i < len1 && j < len2) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            if (Character.isDigit(c1) && Character.isDigit(c2)) {
                int val1 = 0, val2 = 0;
                
                while (i < len1 && Character.isDigit(s1.charAt(i))) {
                    // assume no overflow
                    val1 = val1 * 10 + (s1.charAt(i) - '0');
                    i++;
                }
                while (j < len2 && Character.isDigit(s2.charAt(j))) {
                    // assume no overflow
                    val2 = val2 * 10 + (s2.charAt(j) - '0');
                    j++;
                }
                if (val1 < val2)
                    return -1;
                if (val1 > val2)
                    return 1;
            } else {
                if (c1 < c2)
                    return -1;
                if (c2 > c1)
                    return 1;
                i++;
                j++;
            }
        }
        if (i == len1 && j == len2)
            return 0;
        return i == len1 ? -1 : 1;
    }
}
